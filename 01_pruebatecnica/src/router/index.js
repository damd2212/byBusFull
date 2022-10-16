import Vue from "vue";
import VueRouter from "vue-router";
import FuncionPalindromaView from '../views/FuncionPalindromaView'
import FuncionFibonacciView from '../views/FuncionFibonacciView'
import FuncionPrimosView from '../views/FuncionPrimosView'
import FuncionMultiplosView from '../views/FuncionMultiplosView'
import FuncionFactorialView from '../views/FuncionFactorialView'
import InicioSesionView from '../views/InicioSesionView'
import RegistrarseView from '../views/RegistrarseView.vue'
import RutasUsuarioView from '../views/RutasUsuarioView'

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "inicio",
    component: InicioSesionView

  },
  {
    path: "/registrarse",
    name: "registrarse",
    component: RegistrarseView
  },
  {
    path: "/rutasUsuario",
    name: "rutasUsuario",
    component: RutasUsuarioView
  },
  {
    path: "/funcionPalindroma",
    name: "funcionPalindroma",
    component: FuncionPalindromaView,
  },
  {
    path: "/funcionFibonacci",
    name: "funcionFibonacci",
    component: FuncionFibonacciView,
  },
  {
    path: "/funcionPrimos",
    name: "funcionPrimos",
    component: FuncionPrimosView,
  },
  {
    path: "/funcionMultiplos",
    name: "funcionMultiplos",
    component: FuncionMultiplosView,
  },
  {
    path: "/funcionFactorial",
    name: "funcionFactorial",
    component: FuncionFactorialView,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
