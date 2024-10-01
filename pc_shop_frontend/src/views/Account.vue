<template>
  <HeaderComponent></HeaderComponent>
  <div class="view">
    <form>
      <div class="form-group">
        <label for="email">Email address</label>
        <input
          type="email"
          class="form-control"
          id="email"
          aria-describedby="emailHelp"
          placeholder="Enter email"
          v-model="email"
        />
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input
          v-model="password"
          type="password"
          class="form-control"
          id="password"
          placeholder="Password"
        />
      </div>
      <button type="button" @click="submitLogin" class="btn btn-primary">Account Erstellen</button>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
</template>

<script setup lang="ts">
import HeaderComponent from '@/components/HeaderComponent.vue'
import Customer_account from '@/models/Customer_account'
import Customer_accountService from '@/services/Customer_accountService'
import { ref } from 'vue'

let customer_accountService = new Customer_accountService()
let email = ref('')
let password = ref('')

function submitLogin() {
  debugger
  let customer_account = {
    password: password.value,
    email: email.value
  }
  customer_accountService.addCustomerAccount(customer_account)
}
</script>
