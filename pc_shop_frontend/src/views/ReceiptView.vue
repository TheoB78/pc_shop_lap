<template>
  <HeaderComponent></HeaderComponent>
  <div class="view">
    <h1>Rechnung</h1>
    <div v-if="!shipment">Nicht gefunden</div>
    <div v-else class="row">
      <div>{{ shipment }}</div>
    </div>
  </div>
</template>

<script setup lang="ts">
import HeaderComponent from '@/components/HeaderComponent.vue'
import ShipmentService from '@/services/ShipmentService'
import Shipment from '@/models/Shipment'
import { onMounted, ref } from 'vue'

let shipmentService = new ShipmentService()
let shipment = ref()

onMounted(() => {
  getShipment()
})

function getShipment() {
  shipmentService.getShipmentById(1).then((response) => (shipment.value = response))
}
</script>
