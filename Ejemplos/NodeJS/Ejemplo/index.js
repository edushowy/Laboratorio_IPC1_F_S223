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
const cors = require('cors');
const bodyParser = require('body-parser');
const app = express();

//para enviar parametros por body
app.use(bodyParser.json());
app.use(cors());

/*      ARRAYS      */

var estudiantes = [];
// informacion contenida en estudiante {nombre:"nombre", apellido:"apellido", usuario:"user", "carnet: "carnet", genero:"genero", clave:"clave", activo:"1"}

var cursos =[];
// informacion contenida en cursos {identificador:123, nombre:"IPC1", seccion:"F", catedratico:12, cantEstudiantes:0}

var profesores =[];
// informacion contenida en profesores {carnet:123, nombres:"Luis", apellidos:"Lopez", usuario:"user", clave:"clave", activo:1, genero:"genero"}

var asignaciones = [];
// informacion contenida en asignaciones { carnetEstudiante:123, identificadorCurso: 123}


/*      VARIABLES GLOBALES      */

let usuarioActivo=null;

/*      FUNCIONES      */


function existeUsuarioEstudiante(nombreUsuario){
/* 
    Esta funcion recibe el nombre de usuario como parametro, busca el mismo dentro del array que contiene a todos los estudiantes
    si lo encuentra retorna true, si no existe retorna false
*/
    let estu;
    let existe=false;
    for(let indice=0; indice<estudiantes.length;indice++){
        estu = estudiantes[indice];
        if(nombreUsuario===estu.usuario){
            existe=true;
        }        
    }    
    return existe;
}

function existeIdentificadorCuros(identificador){
/* 
    Esta funcion recibe el identificador de curso como parametro, busca el mismo dentro del array que contiene a todos los cursos
    si lo encuentra retorna true, si no existe retorna false
*/
    let cur;
    let existe=false;
    for(let indice=0; indice<cursos.length;indice++){
        cur = cursos[indice];
        if(identificador===cur.identificador){
            existe=true;
        }        
    }    
    return existe;
}

function existeCarnetEstudiante(carnet){
/* 
    Esta funcion recibe el carnet de curso como parametro, busca dentro del array que contiene a todos los estudiantes 
    si lo encuentra retorna true, si no existe retorna false
*/
    let estu;
    let existe=false;
    for(let indice=0; indice<estudiantes.length;indice++){
        estu = estudiantes[indice];
        if(carnet===estu.carnet){
            existe=true;
        }        
    }    
    return existe;
}

function existeAsignacionPrevia(carnet, identificador){
    /* 
        Esta funcion recibe el carnet e identificador de curso como parametros, busca el mismo dentro del array que contiene a todas las
        asignaciones si lo encuentra retorna true, si no existe retorna false
    */
    let asigna;
    let existe=false;
    for(let indice=0; indice<asignaciones.length;indice++){
        asigna = asignaciones[indice];
        if(carnet===asigna.carnetEstudiante && identificador===asigna.identificadorCurso){
            existe=true;
        }        
    }    
    return existe;
}

function iniciarSesion(usuario, clave){
/**
 *  Esta funcion busca dentro de los arrays de estudiantes y profesores, si encuentra una coincidencia de usuario y clave
 *  define a ese usuario como el usuario que se esta utilizadon en el sitio, tambien devuelve un tipo que indica si es 
 *  estudiante  = 1
 *  profesor    = 2
 *  no existe   = 0
 */
    let tipo = 0;
    let temp = null;

    for(let indice=0; indice<estudiantes.length;indice++){
        temp = estudiantes[indice];
        if(usuario===temp.usuario && clave===temp.clave){
            tipo=1;
            usuarioActivo=temp;
        }
    }

    for(let indice=0; indice<profesores.length;indice++){
        temp = profesores[indice];
        if(usuario===temp.usuario && clave===temp.clave){
            usuarioActivo=temp;
            tipo=2;
        }
    }

    return tipo;
}

function existeUsuarioProfesor(nombreUsuario){
    /* 
        Esta funcion recibe el nombre de usuario como parametro, busca el mismo dentro del array que contiene a todos los estudiantes
        si lo encuentra retorna true, si no existe retorna false
    */
        let prof;
        let existe=false;
        for(let indice=0; indice<profesores.length;indice++){
            estu = profesores[indice];
            if(nombreUsuario===prof.usuario){
                existe=true;
            }        
        }    
        return existe;
    }

// puerto en el que el servidor esta esperando las peticiones
app.listen(3002, ()=>{
    console.log('Nuestro servidor esta corriendo en el puerto 3002');
});

// ejemplo envio de parametros por URL se sugiere enviar parametros por body
app.get('/conParametros/:nombre/:apellido', function(req, res){
    const nombre = req.params.nombre;
    const apellido = req.params.apellido;       
    res.send("Bienvenido: "+nombre+" "+apellido);
});


/**
 *  ENDPOINTS PARA EL MANEJO DE ESTUDIANTES
 */


app.post('/guardarEstudianteArreglo', function(req, res){
/**
 *  Este endpoint agrega un usuario al array de estudiantes, y valida si este aun no existe segun su usuario
 */
    const usuario = req.body.usuario;
    if(!existeUsuarioEstudiante(usuario)){
        const nombre = req.body.nombre;
        const apellido =  req.body.apellido;
        const usuario = req.body.usuario;
        const carnet = req.body.carnet;
        const genero = req.body.genero;
        const clave = req.body.clave;
        const activo = 1;
        estudiantes.push({nombre:nombre, apellido:apellido, usuario: usuario, clave: clave, carnet: carnet, genero:genero, activo:activo});    
        res.json({ mensaje:"ingresado al arreglo el estudiante="+nombre+",carnet="+carnet});
    }else{
        res.json({ mensaje:"El usuario: "+usuario+" ya existe"});
    }
    
});

app.post('/mostrarEstudiante', function(req, res){
    const usuario = req.body.usuario;
    let estu={usuario:null};
    let temp=null;
    
    for(let indice=0; indice<estudiantes.length; indice++){
        temp = estudiantes[indice];
        if(temp.usuario===usuario){
            estu=temp;           
        }
    }
    res.json(estu);
});

app.get('/recorrerArregloEstudintes', function(req, res){     // se ve en la consola del servidor
    console.log("Info almacenada en el  arreglo: ");
    let estu;
    for(let indice=0; indice<estudiantes.length;indice++){
        estu = estudiantes[indice];        
        console.log("---> "+indice+" Nombre: "+estu.nombre+", Apellido: "+estu.apellido);
    }    
    res.json(estudiantes);
});

app.post('/modificarEstudiante', function(req, res){
    let usu=req.body.usuario;
    let estu;
    for(let indice=0; indice<estudiantes.length;indice++){
        estu = estudiantes[indice];
        if(usu==estu.usuario){
            estu.nombre = req.body.nombre;
            estu.apellido =  req.body.apellido;
            estu.carnet = req.body.carnet;
            estu.genero = req.body.genero;
            estu.clave = req.body.clave;
        }        
    }    
    res.json({mensaje:"Usuario="+estu.usuario+" modificadoExitosamente"});
});

app.post('/asignarEstudiante', function(req, res){
    const carnetEstudiante = req.body.carnet;
    const identificadorCurso = req.body.identificador;
    
    if(existeIdentificadorCuros(identificadorCurso) && existeCarnetEstudiante(carnetEstudiante)){
        if(asignaciones.length>0){
            if(!existeAsignacionPrevia(carnetEstudiante, identificadorCurso)){
                asignaciones.push({ carnetEstudiante:carnetEstudiante, identificadorCurso: identificadorCurso});
            }else{
                res.json({mensaje:"Ya existe una asignacion para el carnet: "+carnetEstudiante+" con el identificador de curso: "+identificadorCurso});
            }
        }else{
            asignaciones.push({ carnetEstudiante:carnetEstudiante, identificadorCurso: identificadorCurso});
        }        
        res.json({mensaje:"Asignacion exitosa para el carnet: "+carnetEstudiante+" con el identificador de curso: "+identificadorCurso});
    }else{
        res.json({mensaje:"El carnet: "+carnetEstudiante+" o el identificador de curso: "+identificadorCurso+" No existe"});
    }
    
});

/**
 *  ENDPOINTS PARA EL MANEJO DE PROFESORES
 */

app.post('/guardarProfesorArreglo', function(req, res){
    /**
     *  Este endpoint agrega un usuario al array de estudiantes, y valida si este aun no existe segun su usuario
     */
        const usuario = req.body.usuario;
        if(!existeUsuarioEstudiante(usuario)){
            const nombre = req.body.nombre;
            const apellido =  req.body.apellido;
            const usuario = req.body.usuario;
            const carnet = req.body.carnet;
            const genero = req.body.genero;
            const clave = req.body.clave;
            const activo = 1;
            profesores.push({nombre:nombre, apellido:apellido, usuario: usuario, clave: clave, carnet: carnet, genero:genero, activo:activo});    
            res.json({ mensaje:"ingresado al arreglo el profesor="+nombre+",carnet="+carnet});
        }else{
            res.json({ mensaje:"El usuario: "+usuario+" ya existe"});
        }
        
    });
    
    app.get('/mostrarProfesor', function(req, res){
        const usuario = req.body.usuario;
        let prof={usuario:null};
        let temp=null;
        
        for(let indice=0; indice<profesores.length; indice++){
            temp = profesores[indice];
            if(temp.usuario===usuario){
                prof=temp;           
            }
        }
        res.json(estu);
    });
    
    app.get('/recorrerArregloProfesores', function(req, res){     // se ve en la consola del servidor
        console.log("Info almacenada en el  arreglo: ");
        let prof;
        for(let indice=0; indice<profesores.length;indice++){
            prof = profesores[indice];        
            console.log("---> "+indice+" Nombre: "+prof.nombre+", Apellido: "+prof.apellido);
        }    
        res.json({ mensaje: "Arreglo recorrido exitosamente"});
    });
    
    app.post('/modificarProfesor', function(req, res){
        let usu=req.body.usuario;
        let prof;
        for(let indice=0; indice<profesores.length;indice++){
            estu = profesores[indice];
            if(usu==prof.usuario){
                prof.nombre = req.body.nombre;
                prof.apellido =  req.body.apellido;
                prof.carnet = req.body.carnet;
                prof.genero = req.body.genero;
                prof.clave = req.body.clave;
            }        
        }    
        res.json({mensaje:"Usuario="+prof.usuario+" modificadoExitosamente"});
    });

/**
 *  ENDPOINTS PARA EL MANEJO DE CURSOS
 */

app.post('/guardarCursoArreglo', function(req, res){    
    const identificador = req.body.identificador;
    if(!existeIdentificadorCuros(identificador)){
        const nombre =  req.body.nombre;
        const seccion = req.body.seccion;
        const catedratico = req.body.catedratico;
        const cantEstudiantes = req.body.cantEstudiantes;
        cursos.push({identificador:identificador, nombre:nombre, seccion:seccion, catedratico:catedratico, cantEstudiantes:cantEstudiantes});
        res.json({mensaje:"Agregado al arreglo el curso: "+nombre+" identificador: "+identificador+" "});
    }else{
        res.json({mensaje:"El identificador de curso: "+identificador+" ya existe"});
    }
});



/**
 *  ENDPOINTS PARA MANEJO DEL SITIO
 */

app.get('/cerrarSesion', function(req, res){     // se ve en la consola del servidor    
    usuarioActivo=null;
    res.json({ mensaje: "se cerro sesion exitosamente"});
});

app.get('/iniciarSesion', function(req, res){     // se ve en la consola del servidor    
    const usuario =  req.body.usuario;
    const clave = req.body.clave;
    let val = iniciarSesion(usuario,clave);
    
    if(val===1){
        console.log("ingreso un Estudiante");
    }else if(val==2){
        console.log("ingreso un Profesor")
    }else{
        console.log("Usuario y/o Clave incorrectos")
    }

    res.json({ mensaje: "se inicio sesion exitosamente"});
});