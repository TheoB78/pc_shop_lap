<template>
  <HeaderComponent />
  <div class="view">
    <h1>Warenkorb</h1>
    <!-- <button type="button" class="btn btn-primary" @click="getItems">Teste</button> -->
    <!-- <button type="button" class="btn btn-primary" @click="debugItems">Teste</button> -->
    <div v-if="!items">Ladet</div>
    <div v-else-if="!items.length">Einkaufswagen leer</div>
    <div v-else>
      <div v-for="item in items" class="row item-row">
        <div class="col-md-3">
          <img class="img-fluid" :src="`/src/assets/${item.image_path}`" />
        </div>
        <div class="col-md-6">
          <h4>{{ item.pc_name }}</h4>
          <h4 class="price">{{ item.base_price }}</h4>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import HeaderComponent from '@/components/HeaderComponent.vue'
import { ref, onMounted } from 'vue'
import PcService from '@/services/PcService'
import Pc from '@/models/Pc'
let items = ref()
items.value = []
let total = ref()
const pcService = new PcService()

onMounted(() => {
  getItems()
})

function getItems() {
  console.log(localStorage)
  for (let index = 0; index < localStorage.length; index++) {
    console.log(localStorage.key(index))
    console.log(Number(localStorage.getItem(localStorage.key(index)!)))
    pcService
      .getPcById(Number(localStorage.getItem(localStorage.key(index)!)))
      .then((response) => items.value.push(response))
  }
}

function debugItems() {
  console.log(items.value)
}
</script>

<style>
.item-row {
  border-bottom: solid 1px grey;
  margin-bottom: 30px;
}
.price {
  float: right;
}
</style>
