import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/:pathMatch(.*)*',
      redirect: '/pc'
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
    },
    {
      path: '/account',
      component: () => import('../views/Account.vue')
    },
    {
      path: '/receipt',
      component: () => import('../views/ReceiptView.vue')
    }
  ]
})

export default router
