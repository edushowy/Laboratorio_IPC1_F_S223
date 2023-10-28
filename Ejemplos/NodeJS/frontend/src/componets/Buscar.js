import React from 'react';
import axios from 'axios';
import { useState } from 'react';
import { Botonera } from './Botonera';
import { BarraNavegacio } from './BarraNavegacio';

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
            <BarraNavegacio />
            <Botonera />
            <center>
                <div className="card col-md-6">
                    <center>
                        <div className="card-body col-md-10">
                            <div className="input-group mb-3">
                                <span className="input-group-text" id="basic-addon1">Ingrese un usuario</span>
                                <input className="form-control" type="text" id="usuarioTxt" name="usuarioTxt" placeholder='usuario' />
                            </div>
                            <br />
                            <button className="btn btn-success" onClick={mostrarEstudiante()}>Buscar</button>

                        </div>
                    </center>
                </div>
            </center>

            {info ? (
                <div>
                    <br/>
                    <p className="display-3">Nombre:{info.nombre}</p>
                    <p className="display-5">Apellido:{info.apellido}</p>
                </div>
            ) : (
                <div>
                    <p>Cargando info...</p>
                </div>
            )}
        </div>
    )
}
