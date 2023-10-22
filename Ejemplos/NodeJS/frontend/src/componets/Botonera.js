import React from 'react';
import { useNavigate } from 'react-router-dom';

export const Botonera = () => {

    const navigate = useNavigate();

    const guardar = () => {
        navigate('/');
    }

    const buscar = () => {
        navigate('/guardar');
    }

    const mostrar = () => {
        navigate('/mostrar');
    }

    return (
        <div>
            <button onClick={guardar}>Guardar</button>
            <button onClick={buscar}>Buscar</button>
            <button onClick={mostrar}>Mostrar</button>
        </div>
    )
}
