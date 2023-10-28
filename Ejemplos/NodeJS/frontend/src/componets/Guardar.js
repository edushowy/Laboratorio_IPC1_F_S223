import React from 'react';
import axios from 'axios';
import { Botonera } from './Botonera';
import { BarraNavegacio } from './BarraNavegacio';


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
            <BarraNavegacio />
            <Botonera />

            <center>
                <div className="card col-md-6">
                <center>
                    <div className="card-body col-md-10">
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Usuario</span>
                            <input className="form-control" type="text" id="usuarioTxt" name="usuarioTxt" placeholder='usuario' />
                        </div>
                        <br />
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Nobre</span>
                            <input className="form-control" type="text" id="nom" name="nom" placeholder='nombre' />
                        </div>
                        <br />
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Apellido</span>
                            <input className="form-control" type="text" id="ape" name="ape" placeholder='apellido' />
                        </div>
                        <br />
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Carnet</span>
                            <input className="form-control" type="text" id="car" name="car" placeholder='carnet' />
                        </div>
                        <br />
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Clave</span>
                            <input className="form-control" type="text" id="cla" name="cla" placeholder='clave' />
                        </div>
                        <br />
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Genero</span>
                            <input className="form-control" type="text" id="gen" name="gen" placeholder='genero' />
                        </div>
                        <br />
                        <div className="input-group mb-3">
                            <span className="input-group-text" id="basic-addon1">Activo</span>
                            <input className="form-control" type="text" id="act" name="act" placeholder='activo' />
                        </div>
                        <br />



                        <button className="btn btn-danger" onClick={guardarEstudianteF}>Guardar</button>



                    </div>
                    </center>
                </div>
            </center>
        </div>

    )
}
