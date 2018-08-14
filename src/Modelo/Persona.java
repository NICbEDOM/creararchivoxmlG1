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
public class Persona {
    
    private String nombre;
    private String telefono;
    private String correo;

    
    //Constructor
    public Persona(){
        
    }
    
    public Persona(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    //Set & Get
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    //To String
    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + '}';
    }


}
