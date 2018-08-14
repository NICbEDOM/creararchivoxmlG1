/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionarchivoxmlg1;

import Modelo.Estudiante;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author nicolas.bedoya
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField TBNombre;

    @FXML
    private TextField TBTelefono;

    @FXML
    private TextField TBCorreo;

    @FXML
    private TextField TBCodigo;

    @FXML
    private TextField TBCarrera;

    
    LinkedList<Estudiante> listaE;

    @FXML
    private void AccionAgregarEstudiante(ActionEvent event) {
        String nombre = TBNombre.getText();
        String telefono = TBTelefono.getText();
        String correo = TBCorreo.getText();
        String codigo = TBCodigo.getText();
        String carrera = TBCarrera.getText();

        Estudiante objE = new Estudiante(nombre, telefono, carrera, codigo, carrera);
        listaE.add(objE);
    }

    @FXML
    private void AccionGuardarArchivo(ActionEvent event) {
        Estudiante objeV = new Estudiante();
        boolean guardar = objeV.crearArchivoXML(listaE);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE = new LinkedList<>();
    }

}
