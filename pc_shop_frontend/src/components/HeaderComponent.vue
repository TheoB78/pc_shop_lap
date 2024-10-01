<template>
  <header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark nav-padding">
      <a class="navbar-brand" href="#">Pc Shop</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarText"
        aria-controls="navbarText"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <RouterLink to="/pc" class="nav-link" href="#">Produkte</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/cart" class="nav-link" href="#">Warenkorb</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink to="/account" class="nav-link" href="#">Account</RouterLink>
          </li>
        </ul>
      </div>
    </nav>
  </header>
</template>

<script setup>
import { RouterLink } from 'vue-router'
</script>

<style>
.nav-padding {
  padding: 25px;
}
</style>
