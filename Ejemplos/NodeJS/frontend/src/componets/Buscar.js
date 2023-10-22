import React from 'react';
import axios from 'axios';
import { useState } from 'react';
import { Botonera } from './Botonera';

export const Buscar = () => {

    const [info, setInfo] = useState(null);

    const mostrarEstudiante = async () => {
        var usr = document.getElementById('usuarioTxt').value;
        const url = 'http://localhost:3002/mostrarEstudiante';

        axios.post(url, {
            "usuario": usr
        }).then((response) => {
            setInfo(response.data);
        }).catch((error) => {
            console.log("ocurrio un error: " + error);
        });

    };

    return (
        <div>
            <Botonera />

            <input type="text" id="usuarioTxt" name="usuarioTxt" placeholder='usuario' />
            <br />
            <button onClick={mostrarEstudiante}>Buscar</button>

            {info ? (
                <div>
                    <p>Nombre:{info.nombre}</p>
                    <p>Apellido:{info.apellido}</p>
                </div>
            ) : (
                <div>
                    <p>Cargando info...</p>
                </div>
            )}
        </div>
    )
}
