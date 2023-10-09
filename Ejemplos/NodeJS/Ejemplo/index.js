/* 

    instalar los siguiente desde los links que se proporcionan

    NodeJS:
        https://nodejs.org/en

    Visual Studio Code:
        https://code.visualstudio.com/download

    >>> instalando las dependencias necesarias, abrir una nueva terminan en visual studio code
    
    expres:
        npm i express

    nodemon:
        npm i nodemon -g

    body-parser:
        npm i body-parser

    para ejecutar nodemon:
        nodemon index.js
    debemos estar en la misma ubicacion del archivo para que funcione

    si nos da error "la ejecución de scripts está deshabilitada en este sistema" ejecutar los siguientes comandos en powershell modo administrador

    revisar el esttus con:
        Get-ExecutionPolicy
    
    si es: 
        Restricted

    ejecute el comando:
        Set-ExecutionPolicy RemoteSigned



    
para ejecutar entramos a la ruta donde esta este archivo 'index.js' y aplicamos el siguiente comando node index.js */

// llamanos a las dependencias
const express = require('express');
const bodyParser = require('body-parser');

const app = express();

//para enviar parametros por body
app.use(bodyParser.json());

app.listen(3002, ()=>{
    console.log('Nuestro servidor esta corriendo en el puerto 3002');
});

app.get('/unaCadena', function(req, res){
    res.send("Hola desde el servidor");
});

app.get('/conParametros/:nombre/:apellido', function(req, res){
    const nombre = req.params.nombre;
    const apellido = req.params.apellido;
       
    res.send("Bienvenido: "+nombre+" "+apellido);
});

app.get('/conBody', function(req, res){
    const nombre = req.body.nombre;
    const apellido =  req.body.apellido;
    
    res.send("Hola: "+nombre+" "+apellido);
});

app.get('/operaciones', function(req, res){
    const num1 = parseInt(req.body.num1);
    const num2 =  parseInt(req.body.num2);

    const sum = num1+num2;
    const rest = num1-num2;
    const mul = num1*num2;
    const div = num1/num2;
    
    res.send("Resultados suma="+sum+" resta="+rest+" multiplicacion="+mul+" division="+div);
});