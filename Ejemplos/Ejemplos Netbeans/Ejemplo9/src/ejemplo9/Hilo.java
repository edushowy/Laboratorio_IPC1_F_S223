/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edush
 */
public class Hilo extends Thread {

    /**
     *
     */
    @Override
    public void run(){
        for(int x=0;x<6; x++){
            System.out.println("Hola "+x);
            // dibujo es una jlabel que tiene una imagen dentro
            //dibujo.locate(x+100*valor,y);
            // x=x+100*valor
            // valor seria 10
            try {
                
                /*
                    ancho su panel (donde esta la jlabel)
                    1000 pixeles 1 km = 100 px 
                    1000/100=10 
                */
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }   
}
