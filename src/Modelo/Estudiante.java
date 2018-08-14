/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author nicolas.bedoya
 */
public class Estudiante extends Persona {

    private String codigo;
    private String carrera;

    //Constructor
    public Estudiante() {

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
        return "Estudiante{" + super.toString() + "codigo=" + codigo + ", carrera=" + carrera + '}';
    }

    public boolean crearArchivoXML(LinkedList<Estudiante> listaE) {
        boolean g = false;

        try {
            Element universidad = new Element("universidad"); //Elemento = Etiqueta
            Document doc = new Document(universidad);

            for (int i = 0; i < listaE.size(); i++) {
                Element estudiante = new Element("estudiante");
                estudiante.addContent(new Element("nombre").setText(listaE.get(i).getNombre()));
                estudiante.addContent(new Element("telefono").setText(listaE.get(i).getTelefono()));
                estudiante.addContent(new Element("correo").setText(listaE.get(i).getCorreo()));
                estudiante.addContent(new Element("codigo").setText(listaE.get(i).getCodigo()));
                estudiante.addContent(new Element("carrera").setText(listaE.get(i).getCarrera()));

                doc.getRootElement().addContent(estudiante);/*Añade y cierra el destinatario u objetivo
                de esta forma se almacena los datos y se impide que otro usuario edite*/
            }
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("Universidad.xml"));
            g = true;
        } catch (IOException io) {
            System.out.println(io.getMessage());
            g = false;
        }

        return g;
    }

}
