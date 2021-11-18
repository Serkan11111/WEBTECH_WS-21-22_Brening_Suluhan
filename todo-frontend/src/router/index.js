import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Monatsuebersicht from '../views/Monatsuebersicht.vue'
import Wochenuebersicht from '../views/Wochenuebersicht.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/monatsuebersicht',
    name: 'Monatsübersicht',
    component: Monatsuebersicht
  },
  {
    path: '/wochenuebersicht',
    name: 'Wochenübersicht',
    component: Wochenuebersicht
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  linkActiveClass: 'active',
  routes
})

export default router
