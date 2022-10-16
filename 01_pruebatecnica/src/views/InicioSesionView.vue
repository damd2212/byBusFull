<template>
    <div>
        <div class="logo">
            <img src="../assets/images/logo.png" alt="">
            <div class="form">
                <p class="Welcome">Bienvenido!</p>
                <form v-on:submit.prevent="iniciar_sesion" enctype="multipart/form-data" class="formu" action="">
                    <div class="elemF">
                        <p class="labelN alinear">Cedula</p>
                        <input type="text" id="cedula" class="in alinear" name="user" placeholder="Ej: juan" required
                        v-model="cedula" />
                        <p class="labelC alinear">Contraseña</p>
                        <input type="password" id="password" class="in alinear" name="pass" placeholder="" required
                        v-model="contra" />
                        <p class="alinear">No tienes cuenta?, <a href="../registrarse" id="Back">Registrate</a></p>
                        <input type="submit" class="Send alinear" value="Iniciar"/>
                    </div>
                    
                </form>
                
            </div>
            <div class="foot">
                <p>Desarrolado por</p>
            </div>
        </div>
    </div>
    
    
</template>
<script>
import axios from 'axios'
export default {
    name: "InicioSesionView",
    mounted() {
        document.title = "Inicio Sesion";
    },
    data: function () {
        return {
            cedula: "",
            contra: ""
        };
    },
    methods:{
        iniciar_sesion(){
            return axios.get('http://localhost:8082/user/login/' + this.cedula + '/' + this.contra).then((response) => {
                console.log(response.data)
                if (response.data != "") {
                    console.log("Funciona");
                    this.$router.push("/rutasUsuario")
                }else{
                    console.log("Paila no existe")
                    alert("Credenciales incorrectas")
                }
            });
        }
    }
};
</script>
<style scoped>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
.form{
    width: 30%;
    max-width: 1000px;
    height: 54vh;
    margin: auto;
    background-color: rgba(196, 196, 196, 0.5);
}

.elemF{
    display: flex;
    flex-direction: column;
    align-items: center;
}
.alinear{
    margin-top: 18px;
}
.labelC, .labelN{
    font-family: 'Inter', Arial, Helvetica, sans-serif;
    font-weight: bold;
}

.in{
    background: rgb(196, 196, 196);
}
.Welcome{
    font-family: 'Inter', 'Arial';
    font-style: italic;
    font-size: 25px;
}
.Send{
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
    margin-top: 25px;
}
.Send:hover{
    background: #4357ad;
}
.foot{
    background-color: #246eb9;
    margin-top: 100px;
    padding: 40px 0;
}
</style>

