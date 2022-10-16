import Vue from "vue";
import VueRouter from "vue-router";
import InicioSesionView from '../views/InicioSesionView'
import RegistrarseView from '../views/RegistrarseView.vue'
import RutasUsuarioView from '../views/RutasUsuarioView.vue'
import RegistrarRutaView from '../views/RegistrarRutaView'
import EditarRutaView from '../views/EditarRutaView'
import ApiView from '../views/ApiView'

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
    path: "/registroRuta",
    name: "registroRuta",
    component: RegistrarRutaView
  },
  {
    path: "/editarRuta",
    name: "editarRuta",
    component: EditarRutaView
  },
  {
    path: "/apiView",
    name: "apiView",
    component: ApiView,
  },
  
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
