/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipos;

import abstractas.Automovil;

/**
 *
 * @author edush
 */
public class Camionetilla extends Automovil{
    
    int ccPorCilindro = 1000;

    public Camionetilla(int cilindros, int puertas, String marca, int modelo) {
        super(cilindros, puertas, marca, modelo);
    }
    
    @Override
    public double kmGalon() {
        return ccPorCilindro*getCilindros();
    }

    @Override
    public int porcentajeEficiencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
