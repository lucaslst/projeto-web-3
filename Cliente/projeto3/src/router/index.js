import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Cadastrousuario from "../views/Cadastrousuario.vue";
import Autor from '../views/Autor.vue'
import Genero from '../views/Genero.vue'
import Publicar from '../views/Publicar.vue'
import Meuslivros from '../views/Meuslivros.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Login',
    component: Login
  },
  {
    path: '/cadastrousuario',
    name: 'Cadastrousuario',
    component: Cadastrousuario
  },
  {
    path: '/autor',
    name: 'Autor',
    component: Autor
  },
  {
    path: '/genero',
    name: 'Genero',
    component: Genero
  },
  {
    path: '/Publicar',
    name: 'Publicar',
    component: Publicar
  },
  {
    path: '/meuslivros',
    name: 'Meuslivros',
    component: Meuslivros
  },
  {
    path: '/home',
    name: 'Home',
    component: Home
  },
  { path: '*', redirect: '/' } 

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
