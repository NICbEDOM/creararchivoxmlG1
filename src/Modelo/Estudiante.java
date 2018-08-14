/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nicolas.bedoya
 */
public class Estudiante extends Persona{
    
    private String codigo;
    private String carrera;
    
    
    //Constructor
    public Estudiante(){
        
    }
    
    public Estudiante(String codigo, String carrera, String nombre, String telefono, String correo) {
        super(nombre, telefono, correo);
        this.codigo = codigo;
        this.carrera = carrera;
    }
    
    
    //Set & Get
    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    //To String
    @Override
    public String toString() {
        return "Estudiante{" +super.toString() + "codigo=" + codigo + ", carrera=" + carrera + '}';
    }

    
}
