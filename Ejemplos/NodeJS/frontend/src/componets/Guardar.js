import React from 'react';
import axios from 'axios';
import { Botonera } from './Botonera';


export const Guardar = () => {

    const borrado = () => {
        document.getElementById('nom').value = "";
        document.getElementById('ape').value = "";
        document.getElementById('usuarioTxt').value = "";
        document.getElementById('cla').value = "";
        document.getElementById('car').value = "";
        document.getElementById('gen').value = "";
        document.getElementById('act').value = "";
    }

    const guardarEstudianteF = async () => {

        var nom = document.getElementById('nom').value;
        var ape = document.getElementById('ape').value;
        var usr = document.getElementById('usuarioTxt').value;
        var car = document.getElementById('cla').value;
        var gen = document.getElementById('car').value;
        var cla = document.getElementById('gen').value;
        var act = document.getElementById('act').value;

        const url = 'http://localhost:3002/guardarEstudianteArreglo';

        axios.post(url, {
            "nombre": nom,
            "apellido": ape,
            "usuario": usr,
            "carnet": car,
            "genero": gen,
            "clave": cla,
            "activo": act
        }).then((response) => {
            console.log(response.data);
            alert('usuario agregado exitosamente');
            borrado();
        }).catch((error) => {
            console.log("ocurrio un error: " + error);
        });

    };

    return (
        <div>
            <Botonera />

            <input type="text" id="usuarioTxt" name="usuarioTxt" placeholder='usuario' />
            <br />
            <input type="text" id="nom" name="nom" placeholder='nombre' />
            <br />
            <input type="text" id="ape" name="ape" placeholder='apellido' />
            <br />
            <input type="text" id="car" name="car" placeholder='carnet' />
            <br />
            <input type="text" id="cla" name="cla" placeholder='clave' />
            <br />
            <input type="text" id="gen" name="gen" placeholder='genero' />
            <br />
            <input type="text" id="act" name="act" placeholder='activo' />
            <br />



            <button onClick={guardarEstudianteF}>Guardar</button>




        </div>
    )
}
