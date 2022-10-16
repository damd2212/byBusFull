<template>
    <div>
        <div>
            <app-nav-bar />
            <div>
                <h1>Registro de rutas mas usadas</h1>
            </div>
        </div>
    </div>
</template>
<script>

import NavbarComponentVue from "@/components/NavbarComponent.vue";
import axios from 'axios'
export default {
    name: "InicioSesionView",
    mounted() {
        document.title = "Inicio Sesion";
    },
    components: {
        "app-nav-bar": NavbarComponentVue,
    },
    methods:{
        iniciar_sesion(){
            return axios.get('http://localhost:8090/base/calcularFactorial/' + this.numero).then((response) => {
            if (response.data) {
                this.$route.push("/")
            }
            });
        }
    }
};
</script>
<style scoped></style>