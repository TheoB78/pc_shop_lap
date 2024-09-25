<template>
  <HeaderComponent></HeaderComponent>
  <div class="view">
    <h1 class="margin-top">Produkte:</h1>
    <div class="grid-view">
      <div v-if="!pcs">Laden</div>
      <div v-else-if="!pcs.length">keine Produkte</div>
      <div v-else v-for="pc in pcs" class="card" @click="goToSingleView(pc.id)">
        <img class="img-fluid" :src="`/src/assets/${pc.image_path}`" />
        <div class="card-header">
          {{ pc.pc_name }}
        </div>
        <div class="card-body">
          <!-- <h5 class="card-title">{{ pc.pc_name }}</h5> -->
          <ul class="list-group list-group-flush">
            <li class="list-group-item">{{ pc.base_price }}€</li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import { ref, onMounted } from 'vue'
import PcService from '@/services/PcService'
import { useRouter } from 'vue-router'
import HeaderComponent from '@/components/HeaderComponent.vue'
import { RouterLink } from 'vue-router'

const pcService = new PcService()

let pcs = ref()
let router = useRouter()

onMounted(() => {
  getAllPcs()
})

function getAllPcs() {
  pcService.getAllPcs().then((response) => (pcs.value = response))
}

function goToSingleView(id: number) {
  router.push(`/pc/${id}`)
}
</script>

<style>
.margin-top {
  margin-top: 25px;
}

/*     */
</style>
