/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author edush
 */
public abstract class Automovil {
    
    protected int cilindros;
    protected int puertas;
    protected String marca;
    protected int modelo;

    public Automovil(int cilindros, int puertas, String marca, int modelo) {
        this.cilindros = cilindros;
        this.puertas = puertas;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public int getCilindros(){        
        return cilindros;
    }
    
    public abstract double kmGalon();
    
    public abstract int porcentajeEficiencia(); 
    
}
