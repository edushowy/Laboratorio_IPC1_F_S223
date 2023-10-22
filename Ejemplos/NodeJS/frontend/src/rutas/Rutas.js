import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Guardar } from '../componets/Guardar';
import { MostrarTodos } from '../componets/MostrarTodos';
import { Buscar } from '../componets/Buscar';

export const Rutas = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Guardar />} />
                <Route path="/guardar" element={<Guardar />} />
                <Route path="/buscar" element={<Buscar />} />
                <Route path="/mostrar" element={<MostrarTodos />} />
            </Routes>
        </BrowserRouter>
    )
}
