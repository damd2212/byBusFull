<template>
    <div>
        <div class="logo">
            <img src="../assets/images/logo.png" alt="">
            <div class="form">
                <p class="Welcome">Registrate</p>
                <form class="formu" action="">
                    <p class="labelN alinear">Cedula</p>
                    <input type="text" id="cedula" class="in alinear" name="user" placeholder="Ej: 1111111" required
                    v-model="numero" />
                    <p class="labelN alinear">Nombre</p>
                    <input type="text" id="name" class="in alinear" name="user" placeholder="Ej: juan" required
                    v-model="numero" />
                    <p class="labelN alinear">Telefono</p>
                    <input type="tel" id="phone" class="in alinear" name="user" placeholder="Ej: 3777777777" required
                    v-model="numero" />
                    <p class="labelN alinear">Email</p>
                    <input type="email" id="email" class="in alinear" name="user" placeholder="Ej: example@dominio.com" required
                    v-model="numero" />
                    <p class="labelC alinear">Contraseña</p>
                    <input type="password" id="password" class="in alinear" name="pass" placeholder="" required
                    v-model="numero" />
                    <p class="alinear">Ya te inscribiste, <a href="" id="Back">Inicia sesion</a></p>
                    <input type="submit" class="Send alinear" value="Registrarse"/>
                  
                </form>
                
            </div>
            <div class="foot">
                <p>Desarrolado por</p>
            </div>
        </div>
    </div>
    
    
</template>
<script>
export default {
    name: "FuncionFibonacciView",
    mounted() {
        document.title = "Registrarse";
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
    height: 50vh;
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