import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/pc',
      name: 'pc',
      component: () => import('../views/PcView.vue')
    },
    {
      path: '/pc/:id',
      component: () => import('../views/SinglePcView.vue')
    },
    {
      path: '/cart',
      component: () => import('../views/CartView.vue')
    }
  ]
})

export default router
