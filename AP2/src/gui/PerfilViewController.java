package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class PerfilViewController implements Initializable{
	private CadastroViewController user;
	@FXML
	private Label lblName;
	@FXML
	private Label lblEmail;
	@FXML
	private Label lblCPF;
	@FXML
	private Label lblALtura;
	@FXML 
	private Label lblIdade;
	@FXML
	private Label lblNumero;
	
	@FXML
	public void onPerfilViewOpen() {
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
