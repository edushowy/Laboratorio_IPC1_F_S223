/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author edush
 */
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import objetos.Estudiante;

public class LeerObjetos {

    // variables globales
    String rutaArchivo = "C:\\Users\\edush\\OneDrive\\Escritorio\\salida.bin";
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    
    public LeerObjetos() {
    }
    
    public void lecturaYmostrar() {        

        try {
            
            FileInputStream archivoEntrada = new FileInputStream(rutaArchivo);
            ObjectInputStream lectura = new ObjectInputStream(archivoEntrada);
            
            while (true) {
                try {
                    listaEstudiantes = (ArrayList<Estudiante>)lectura.readObject();
                    lectura.close();                    
                } catch (IOException e) {                    
                    System.out.println("Fin del archivo encontrado");
                    break;
                }                
            }

            System.out.println("lectura completa ...");
            
            for(int posicion=0; posicion<listaEstudiantes.size(); posicion++){
                        Estudiante temp = listaEstudiantes.get(posicion);
                        System.out.println("Nombres: "+temp.getNombres()+" Apellidos: "+temp.getApellidos()+" Carnet: "+temp.getCarnet());
                    }            
            
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }        
    }
}

