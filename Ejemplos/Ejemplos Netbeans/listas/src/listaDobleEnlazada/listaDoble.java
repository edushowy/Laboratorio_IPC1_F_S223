/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDobleEnlazada;

/**
 *
 * @author edush
 */
public class listaDoble {
    private NodoDoble inicio;

    public listaDoble() {
        this.inicio = null;
    }
    
    public void agregar(int valor){
        NodoDoble nuevoNodo = new NodoDoble(valor);
        
        if(inicio==null){
            inicio=nuevoNodo;
        }else{
            NodoDoble temporal = inicio;
            while(temporal.getSiguiente()!=null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(temporal);
        
        }        
    }
    
    public void mostrarNormal(){
        NodoDoble temporal = inicio;
        while(temporal!=null){
            System.out.println("Valor: "+temporal.getValor());
            temporal=temporal.getSiguiente();
        }        
    }
    
    public void mostrarReversa(){
        NodoDoble temporal = inicio;
        while(temporal.getSiguiente()!=null){
            temporal=temporal.getSiguiente();
        }  
        
        while(temporal!=null){
            System.out.println("tiene un valor de: "+temporal.getValor());
            temporal=temporal.getAnterior();
        }
    }
    
    
}
