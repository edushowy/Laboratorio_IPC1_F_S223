/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

/**
 *
 * @author edush
 */
public class Estudiante {
    
    // informacion del estudiante necesaria para realizar lo referente a el
    private String nombres;
    private String apellidos;
    private int carnet;
    private char genero;
    private String clave;

    public Estudiante() {        
    }

    public Estudiante(String nombres, String apellidos, int carnet, char genero) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carnet = carnet;
        this.genero = genero;
        clave="1234";
    }

    public Estudiante(String nombres, String apellidos, int carnet, char genero, String clave) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carnet = carnet;
        this.genero = genero;
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCarnet() {
        return carnet;
    }

    public char getGenero() {
        return genero;
    }

    public String getClave() {
        return clave;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }    
}
