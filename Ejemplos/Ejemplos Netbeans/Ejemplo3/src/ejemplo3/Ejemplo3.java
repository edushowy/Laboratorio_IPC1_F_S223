/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.util.Scanner;

/**
 *
 * @author edush
 */
public class Ejemplo3 {
      
    
    static String[][] notas = new String[20][4];
    static int indice = 0;
    
    public static void main(String[] args) {
        
        
        /*
            Alumno  Mate    Fisica  Progra
        
            Luis    78      80      90  
            Ana     89      77      100
            Jose    61      69      73
            ..      ..      ..      ..
        */
        
        /* Almacenando la informacion en la matriz*/
        notas[indice][0]="Luis";
        notas[indice][1]="78";
        notas[indice][2]="80";
        notas[indice][3]="90";
        
        indice++;        
        notas[indice][0]="Ana";
        notas[indice][1]="89";
        notas[indice][2]="77";
        notas[indice][3]="100";
        
        indice++;
        notas[indice][0]="Jose";
        notas[indice][1]="61";
        notas[indice][2]="69";
        notas[indice][3]="73";
        
        // dejamos listo el indice en la siguiente fila libre de la matriz
        indice++;
        
        System.out.println("********* Listado completo 1 *************");
        mostarNotas();
        agregarNuevo();
                
        System.out.println("********* Listado completo 2 *************");
        
        mostarNotas();                
        agregarNuevo();
                
        System.out.println("********* Listado completo 3 *************");
        
        mostarNotas();
        
        System.out.println( buscarNotas());
                
    }// fin del main
    
    
    public static void mostarNotas(){
        
        System.out.println("Alumno  Mate    Fisica  Progra  Promedio");
        /* Se aumenta un valor en filas para que muestre el nuevo dato */
        for(int fila=0; fila<indice; fila++){
            
            double sumatoria=0;
            
            for(int columna=0; columna<4; columna++){
                System.out.print(notas[fila][columna]+'\t');
                
                if(columna>0){
                    sumatoria = sumatoria + Integer.parseInt(notas[fila][columna]);
                }   
                
                /* otra solicion es mostrarlo hasta que se tengan los 3 valores necesarios
                if(columna==3){
                    int promedio = (int) (sumatoria/3);
                    System.out.print(promedio);
                }
                */
            }
            /* se muestra en pantalla la Division del promedio*/            
            int promedio = (int) (sumatoria/3);
            System.out.print(promedio);
            System.out.println("");
        }
    }
    
    
    public static void agregarNuevo(){
        /* Ingresar informacion con el teclado*/               
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        notas[indice][0]=entrada.nextLine();
        
        System.out.println("Ingrese nota de matematica: ");
        notas[indice][1]=entrada.nextLine();
        
        System.out.println("Ingrese nota de fisica: ");
        notas[indice][2]=entrada.nextLine();
        
        System.out.println("Ingrese nota de progra: ");
        notas[indice][3]=entrada.nextLine();
        
        indice++;
    }
    
    public static int buscarPosicion(String nombre){
        int posicion=-1;        
        
        for(int fila=0; fila<indice; fila++){   
            if(notas[fila][0].equals(nombre)){
                posicion=fila;
            }
        }
        return posicion;
    }
    
    
    public static String buscarNotas(){
        String respuesta="";

        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese el nombre a buscar: ");            
        int posicionIndice = buscarPosicion(entrada.nextLine());
        
        respuesta = respuesta+ "Las notas de: "+notas[posicionIndice][0]+'\n';        
        respuesta = respuesta+ "Mate: "+notas[posicionIndice][1]+'\n';
        respuesta = respuesta+ "Fisica: "+notas[posicionIndice][2]+'\n';
        respuesta = respuesta+ "Progra: "+notas[posicionIndice][3]+'\n';
        
        return respuesta;
    }
}