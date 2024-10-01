<template>
  <HeaderComponent />
  <div class="view">
    <div class="single-view container">
      <div v-if="!pc">Nicht gefunden</div>
      <div v-else class="row">
        <div class="col-md-5">
          <img class="img-fluid" :src="`/src/assets/${pc.image_path}`" />
        </div>
        <div class="col-md-6">
          <h1>{{ pc.pc_name }}</h1>
          <table class="table table-striped">
            <tbody>
              <tr>
                <th scope="row">Preis:</th>
                <td>{{ pc.base_price }} €</td>
              </tr>
              <tr>
                <th scope="row">Processor:</th>
                <td>
                  {{ pc.processor }}
                </td>
              </tr>
              <tr>
                <th scope="row">Ram:</th>
                <td>{{ pc.ram }} GB</td>
              </tr>
              <tr>
                <th scope="row">Speicher:</th>
                <td>{{ pc.pc_memory }} GB</td>
              </tr>
            </tbody>
          </table>
          <div v-if="!additions">nix da</div>
          <div v-else>
            <h3>Zusätze:</h3>
            <div>
              <span></span>
            </div>
            <div v-for="addition in additions" class="form-check">
              <label class="form-check-label" for="flexCheckDefault">
                {{ addition.addition_name }} {{ addition.price }} €
              </label>
              <input
                class="form-check-input"
                type="checkbox"
                :value="addition.id"
                id="flexCheckDefault"
              />
            </div>
          </div>
          <button type="button" class="btn btn-primary" @click="addToCart">In den Warenkorb</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted, reactive } from 'vue'
import PcService from '@/services/PcService'
import Pc from '@/models/Pc'
import Shipment_item from '@/models/Shipment_item'
import { useRoute } from 'vue-router'
import HeaderComponent from '@/components/HeaderComponent.vue'
import AdditionService from '@/services/AdditionService'
import Addition from '@/models/Addition'

const pcService = new PcService()
const additionService = new AdditionService()

let pc = ref()
let additions = ref()
let route = useRoute()

onMounted(() => {
  getPcById(route.params.id)
  getAllAdditions()
})

function getPcById(id: any) {
  pcService.getPcById(id).then((response) => (pc.value = response))
}

function getAllAdditions() {
  additionService.getAllAdditions().then((response) => (additions.value = response))
}

function addToCart() {
  let items

  if (JSON.parse(localStorage.getItem('items')!)) items = JSON.parse(localStorage.getItem('items')!)
  else items = new Array()

  let data = {
    pc: pc.value,
    quantity: 1,
    additions: new Array<Addition>()
  }

  items.push(new Shipment_item(data))

  localStorage.setItem('items', JSON.stringify(items))
}
</script>

<style>
.single-view {
  display: grid;
}

.single-view-image {
  height: 250px;
  width: 250px;
}
</style>
