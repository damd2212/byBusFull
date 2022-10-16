<template>
    <div>
        <div class="logo">
            <img src="../assets/images/logo.png" alt="">
            <div class="form">
                <p class="Welcome">Registrate</p>
                <form v-on:submit.prevent="registrar" enctype="multipart/form-data" class="formu" action="" style="width: 90%; margin-left: 5%;">
                    <br>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Cedula</label>
                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                            placeholder="Ingrese su cedula" v-model="cedula" >
                    </div>
                    
                    <div class="form-group">
                        <label for="exampleInputEmail1">Nombre</label>
                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                            placeholder="Ingrese su nombre" v-model="nombre" >
                    </div>
                    
                    
                    <div class="form-group">
                        <label for="exampleInputEmail1">Celular</label>
                        <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                            placeholder="Ingrese su celular o telefono" v-model="tel" >
                    </div>

                    <div class="form-group">
                        <label for="exampleInputEmail1">Email</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                            placeholder="Ingrese su correo" v-model="eamil" >
                    </div>
                  
                    <div class="form-group">
                        <label for="exampleInputEmail1">Contraseña</label>
                        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                            placeholder="Ingrese su password" v-model="contra" >
                    </div>
                    
                    <p class="alinear">Ya te inscribiste, <a href="../" id="Back">Inicia sesion</a></p>
                    <input type="submit" class="Send alinear" value="Registrarse"/>
                  
                </form>
                
            </div>
            <br>
            <br>
        </div>
    </div>
    
    
</template>
<script>
import axios from 'axios'
export default {
    name: "RegistrarseView",
    mounted() {
        document.title = "Registrarse";
    },
    data: function () {
        return {
            cedula: "",
            nombre:"",
            tel:"",
            email:"",
            contra: ""
        };
    },
    methods:{
        registrar(){
            return axios.post('http://localhost:8082/user/addUser',{id:this.cedula,name:this.nombre,phone:this.tel,email:this.email,password:this.contra}).then((response) => {
                if (response.data) {
                    console.log("Usuario guardado");
                    this.$router.push("/")
                }else{
                    console.log("Error al guardar usuario");
                    alert("Error al guardar usuario")
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
    height: 68vh;
    margin: auto;
    background-color: rgba(196, 196, 196, 0.5);
    
}

.formu{
    display: flex;
    flex-direction: column;
    align-items: center;
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
    margin-top: 20px;
}
.Send:hover{
    background: #4357ad;
}
.foot{
    background-color: #246eb9;
    margin-top: 100px;
    padding: 45px 0;
}
</style>