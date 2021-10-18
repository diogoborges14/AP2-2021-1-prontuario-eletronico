package gui;

import java.net.URL;
import java.util.ResourceBundle;

import entities.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CadastroViewController implements Initializable{
	@FXML
	private TextField textFieldName;
	@FXML
	private TextField textFieldEmail;
	@FXML
	private TextField textFieldCPF;
	@FXML
	private TextField textFieldAltura;
	@FXML
	private TextField textFieldIdade;
	@FXML
	private TextField textFieldEndereco;
	@FXML
	private TextField textFieldNumero;
	@FXML
	private Button btnCadastrar;
	
	User user;
	
	@FXML
	public void onCadastrarAction() {
		user = new User(textFieldName.getText(), textFieldEmail.getText(), textFieldCPF.getText(), Double.parseDouble(textFieldAltura.getText()), Integer.parseInt(textFieldIdade.getText()), textFieldEndereco.getText(), Integer.parseInt(textFieldNumero.getText()));
	}
	public User getuser() {
		return user;
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
