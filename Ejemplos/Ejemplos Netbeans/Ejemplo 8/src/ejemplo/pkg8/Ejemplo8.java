/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg8;

import abstractas.Automovil;
import tipos.Camionetilla;
import tipos.Coupe;

/**
 *
 * @author edush
 */
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil dosPuertas = new Coupe(3,2,"Honda",2001);
        Automovil Puertas = new Camionetilla(3,5,"Honda",2011);
        
        System.out.println("Km-Gal: "+dosPuertas.kmGalon());
        System.out.println("Km-Gal: "+Puertas.kmGalon());
    }
    
}
