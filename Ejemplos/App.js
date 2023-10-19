import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [data, setData] = useState(null);
  const [data2, setData2] = useState(null);
  /**
    
    useEffect(() => {
      if (data) {
        console.log(data); // Verifica si los datos se han actualizado
        console.log("hola");
      }
    }, [data]);
  
   */


  const obtenerEstudiante = () => {
    var usr = document.getElementById('usuarioTxt').value;

    const url = 'http://localhost:3002/mostrarEstudiante';

    axios.post(url, {
      "usuario": usr
    })
      .then((response) => {
        setData(response.data);
      })
      .catch((error) => {
        console.error('Ocurrió un error ' + error);
      });
  }


  const mostrarTodosEstudiantes = () => {
    //var usr = document.getElementById('usuarioTxt').value;

    const url = 'http://localhost:3002/recorrerArregloEstudintes';

    axios.get(url)
      .then((response) => {
        setData2(response.data);
      })
      .catch((error) => {
        console.error('Ocurrió un error ' + error);
      });
  }

  return (
    <>
      <div className="App">
        <input type="text" id="usuarioTxt" name="usuarioTxt" />

        <button onClick={obtenerEstudiante}>Info estudiante</button>
        {data ? (
          <div>
            <p>Nombre: {data.nombre}</p>
            <p>Apellido: {data.apellido}</p>
          </div>
        ) : (
          <p>Cargando datos...</p>
        )}
      </div>

      <div>
        <button onClick={mostrarTodosEstudiantes}>Todos los estudiantes</button>
        {data2 ? (
          <table className="table table-bordered">
          <thead>
              <tr>
              <th>nombre</th>                
              <th>apellido</th>              
              </tr>
          </thead>
          <tbody>
              {data2.map((estu,i) => (
              <tr key={i}>
                  <td>{estu.nombre}</td>                    
                  <td>{estu.apellido}</td>                 
              </tr>
              ))}
          </tbody>
      </table>
        ) : (
          <p>Cargando datos...</p>
        )}
      </div>
    </>
  );
}

export default App;
