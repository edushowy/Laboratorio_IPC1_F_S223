import React from 'react';
import { useState } from 'react';
import axios from 'axios';
import { Botonera } from './Botonera';

export const MostrarTodos = () => {
  const [estudiantes, setEstudiantes] = useState([]);

  const recorrerArregloEstudiantes = async () => {

    const url = 'http://localhost:3002/recorrerArregloEstudintes';

    axios.get(url).then((response) => {
      setEstudiantes(response.data)
    }).catch((error) => {
      console.log("ocurrio un error con el arreglo de estudiantes: " + error);
    });

  };

  return (
    <>

      <Botonera />

      <button onClick={recorrerArregloEstudiantes}>Mostrar Todos</button>



      {estudiantes ? (
        <div>
          <table>
            <thead>
              <tr>
                <th>nombre</th>
                <th>apellido</th>
                <th>usuario</th>
                <th>carnet</th>
                <th>clave</th>
                <th>genero</th>
                <th>activo</th>
              </tr>
            </thead>
            <tbody>
              {estudiantes.map((estu, i) => (
                <tr key={i}>
                  <td>{estu.nombre}</td>
                  <td>{estu.apellido}</td>
                  <td>{estu.usuario}</td>
                  <td>{estu.carnet}</td>
                  <td>{estu.clave}</td>
                  <td>{estu.genero}</td>
                  <td>{estu.activo}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      ) : (
        <div>
          <p>Sin estudiantes aun...</p>
        </div>
      )}

    </>
  )
}
