<template>
    <div>
        <div class="logo">
            <img src="../assets/images/logo.png" alt="">
            <div class="form">
                <p class="Welcome">Bienvenido!</p>
                <form class="formu" action="">
                    <p class="labelN">Cedula</p>
                    <input type="text" id="cedula" class="in" name="user" placeholder="Ej: juan" required
                    v-model="numero" />
                    <p class="labelC">Contraseña</p>
                    <input type="password" id="password" class="in" name="pass" placeholder="" required
                    v-model="numero" />
                    <p class="labelNo">No tienes cuenta?, <a href="" id="Back">Registrate</a></p>
                    <input type="submit" class="Send" value="Iniciar"/>
                  
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
        document.title = "Inicio Sesion";
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
    justify-content: space-between;
    align-items: center;
}

.labelN{
    margin-right: 150px;
}
.labelC{
    margin-right: 110px;
}
.labelC, .labelN{
    font-family: 'Inter', Arial, Helvetica, sans-serif;
    font-weight: bold;
}
.labelNo{
    margin-left: 12px;
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
    margin-top: 30px;
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

