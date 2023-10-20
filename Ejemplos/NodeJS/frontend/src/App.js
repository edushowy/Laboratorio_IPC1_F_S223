import './App.css';
import {useState} from 'react';
import axios from 'axios';

function App() {
  const [info, setInfo] = useState(null);

  const mostrarEstudiante = async() => {
    var usr= document.getElementById('usuarioTxt').value;
    const url = 'http://localhost:3002/mostrarEstudiante';

    axios.post(url, {
      "usuario": usr
    }).then((response)=>{
      setInfo(response.data);
    }).catch((error)=>{
      console.log("ocurrio un error: "+error);
    });

  };

  const guardarEstudiante = async() => {
    
    var nom= document.getElementById('nom').value;
    var ape= document.getElementById('ape').value;
    var usr= document.getElementById('usuarioTxt').value;
    var car= document.getElementById('cla').value;
    var gen= document.getElementById('car').value;
    var cla= document.getElementById('gen').value;
    var act= document.getElementById('act').value;

    const url = 'http://localhost:3002/guardarEstudianteArreglo';

    axios.post(url, {      
      "nombre":nom,
      "apellido":ape,
      "usuario":usr,
      "carnet":car,
      "genero":gen,
      "clave":cla,
      "activo":act
    }).then((response)=>{      
      console.log(response.data)
    }).catch((error)=>{
      console.log("ocurrio un error: "+error);
    });

  };


  return (
    <div className="App">
      <input type="text" id="usuarioTxt" name="usuarioTxt" />
      
      <input type="text" id="nom" name="usuarioTxt" />
      <input type="text" id="ape" name="usuarioTxt" />
      <input type="text" id="car" name="usuarioTxt" />
      <input type="text" id="cla" name="usuarioTxt" />
      <input type="text" id="gen" name="usuarioTxt" />
      <input type="text" id="act" name="usuarioTxt" />

      <button onClick={mostrarEstudiante}>Buscar</button>
      <button onClick={guardarEstudiante}>Guardar</button>

      {info?(
        <div>
          <p>Nombre:{info.nombre}</p>
          <p>Apellido:{info.apellido}</p>
        </div>
      ):(
        <div>
          <p>Cargando info...</p>
        </div>
      )}
    </div>
  );
}

export default App;
