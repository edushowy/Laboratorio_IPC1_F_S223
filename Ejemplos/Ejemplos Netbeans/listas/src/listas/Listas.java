/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

import listaDobleEnlazada.listaDoble;
import listas.listaSimpleEnlazada.ListaSimple;

/**
 *
 * @author edush
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple simple = new ListaSimple();
        simple.agregar(23);
        simple.agregar(12);
        simple.agregar(56);
        simple.agregar(9);
        simple.mostrarTodo();
        
        
        System.out.println("---------------");
        
        
        listaDoble doble = new listaDoble();
        doble.agregar(34);
        doble.agregar(8);
        doble.agregar(45);
        doble.agregar(16);
        doble.mostrarNormal();
        System.out.println("******************");
        doble.mostrarReversa();
        
    }
    
}
