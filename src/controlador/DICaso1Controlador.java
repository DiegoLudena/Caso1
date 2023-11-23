package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DICaso1Controlador implements Initializable{

	//Declaro todos los elementos
    @FXML
    private TextField numSerieTextField;

    @FXML
    private TextField numInstrumentosTextField;

    @FXML
    private TextField pesoTextField;

    @FXML
    private TextField fechaRecepcionTextField;

    @FXML
    private TextField transportistaTextField;

    @FXML
    private TextArea observacionesTextArea;
    
    @FXML
    private Button boton;
    
    //Creo la acción del botón, que imprimirá los textos:
    public void handleGuardarButton(ActionEvent event) {
        System.out.println("Instrumento recibido");
        System.out.println("Núm. Serie: " + numSerieTextField.getText());
        System.out.println("Núm. Instrumentos: " + numInstrumentosTextField.getText());
        System.out.println("Peso: " + pesoTextField.getText());
        System.out.println("Fecha de recepción: " + fechaRecepcionTextField.getText());
        System.out.println("Transportista: " + transportistaTextField.getText());
        System.out.println("Observaciones: " + observacionesTextArea.getText());
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inicializo controlador");
		
	}

}
