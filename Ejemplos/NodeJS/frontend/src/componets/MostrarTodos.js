import React from 'react';
import { useState } from 'react';
import axios from 'axios';
import { Botonera } from './Botonera';
import { BarraNavegacio } from './BarraNavegacio';

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

      <BarraNavegacio />
      <Botonera />
      <br />
      <button className="btn btn-warning" onClick={recorrerArregloEstudiantes}>Mostrar Todos</button>
      <br />

      {estudiantes ? (

        <center>
          <br />
          <br />
          <div className="card col-md-6">


            <div className="card-body col-md-10">
              <center>
                <table className="table table-hover">
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
              </center>
            </div>

          </div>
        </center>
      ) : (
        <div>
          <p>Sin estudiantes aun...</p>
        </div>
      )}

    </>
  )
}
