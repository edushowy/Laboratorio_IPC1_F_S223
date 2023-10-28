import React from 'react';
import { useNavigate } from 'react-router-dom';

export const Botonera = () => {

    const navigate = useNavigate();

    const guardar = () => {
        navigate('/guardar');
    }

    const buscar = () => {
        navigate('/buscar');
    }

    const mostrar = () => {
        navigate('/mostrar');
    }

    return (
        <div className="card-body">
            <button className="btn btn-primary" onClick={guardar} >Guardar</button> &nbsp;
            <button className="btn btn-success" onClick={buscar}>Buscar</button> &nbsp;
            <button className="btn btn-dark" onClick={mostrar}>Mostrar</button>
        </div>
    )
}
