/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.listaSimpleEnlazada;


/**
 *
 * @author edush
 */
public class ListaSimple {
    private Nodo inicio;

    public ListaSimple() {
        this.inicio = null;
    }
    
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        if(inicio==null){
            inicio=nuevoNodo;
        }else{
            Nodo temporal=inicio;
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevoNodo);
        }
    }
    
    public void mostrarTodo(){
        Nodo temporal= inicio;
        
        while(temporal!=null){
            System.out.println("Valor almacenado: "+temporal.getValor());
            temporal=temporal.getSiguiente();
        }
    }

    public Nodo getInicio() {
        return inicio;
    }   
    
    
}
