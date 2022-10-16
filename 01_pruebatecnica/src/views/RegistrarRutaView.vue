<template>
    <div>
        <div class="logo">
            <br>
            <br>
            <br>
            <br>
            <br>

            <div class="form">
                <h3><b>Registrar Ruta</b></h3>
                <form style="width: 90%; margin-left: 5%;">
                    <div class="form-group">
                        <label for="exampleFormControlInput1">Nombre Empresa</label>
                        <input type="text" class="form-control" id="exampleFormControlInput1"
                            placeholder="Ingrese el nombre de la empresa" v-model="nombreEmpre">
                    </div>
                    <div class="form-group">
                        <label for="exampleFormControlInput1">Numero de ruta</label>
                        <input type="number" class="form-control" id="exampleFormControlInput1"
                            placeholder="Ingrese el numero de la ruta" v-model="numruta">
                    </div>
                    <div class="form-group">
                        <label for="exampleFormControlTextarea1">Descripcion</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"
                            v-model="descripcion"></textarea>

                    </div>
                    <br>

                    <button type="button" class="btn btn-info" @click="registrarRuta()">Registrar</button>
                    <br>
                    <br>
                    <button type="button" class="btn btn-danger" @click="Cancelar()">Cancelar</button>



                </form>
            </div>
        </div>
    </div>


</template>
<script>
import axios from 'axios'
export default {
    name: "RegistrarsRutaView",
    mounted() {
        document.title = "Registrarse";
    },
    data: function () {
        return {
            nombreEmpre: "",
            numruta: "",
            descripcion: ""
        };
    },
    methods: {
        registrarRuta() {
            console.log();
            return axios.post('http://localhost:8083/ruta/addRuta', { namecom: this.nombreEmpre, numruta: this.numruta, iduser: localStorage.getItem('usuario'), description: this.descripcion }).then((response) => {
                if (response.data) {
                    console.log("Ruta guardada");
                    this.$router.push("/rutasUsuario")
                } else {
                    console.log("Error al guardar ruta");
                    alert("Error al guardar ruta")
                }
            });
        },
        Cancelar(){
            this.$router.push("/rutasUsuario")
        }
    }
};
</script>
<style scoped>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

.form {
    width: 30%;
    max-width: 1000px;
    height: 55vh;
    margin: auto;
    background-color: rgba(196, 196, 196, 0.5);

}

.formu {
    display: flex;
    flex-direction: column;
    align-items: center;
}

.labelC,
.labelN {
    font-family: 'Inter', Arial, Helvetica, sans-serif;
    font-weight: bold;
}

.in {
    background: rgb(196, 196, 196);
}

.Welcome {
    font-family: 'Inter', 'Arial';
    font-style: italic;
    font-size: 25px;
}

.Send {
    width: 50%;
    text-align: center;
    background: #246eb9;
    color: #fff;
    border: none;
    display: block;
    padding: 15px 10px;
    cursor: pointer;
    border-radius: 6px;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18x;
    margin-top: 20px;
}

.Send:hover {
    background: #4357ad;
}

.foot {
    background-color: #246eb9;
    margin-top: 100px;
    padding: 45px 0;
}
</style>