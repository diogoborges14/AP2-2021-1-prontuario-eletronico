package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable{
	@FXML
	private MenuItem menuItemProntuario;
	@FXML
	private MenuItem menuItemCadastrar;
	@FXML
	private MenuItem menuItemAtualizar;
	@FXML
	private MenuItem menuItemBuscar;
	@FXML
	private MenuItem menuItemAgendarConsulta;
	@FXML
	private MenuItem menuItemMostrarAgendamentos;
	@FXML
	private MenuItem menuItemPerfil;
	
	@FXML
	public void onMenuProntuarioAction() {
		System.out.println("Deu certo");
	}
	@FXML
	public void onMenuCadastrarAction() {
		loadView("/gui/Cadastro.fxml");
	}
	@FXML
	public void onMenuAtualizarAction() {
		System.out.println("Deu certo");
	}
	@FXML
	public void onMenuBuscarAction() {
		System.out.println("Deu certo");
	}
	@FXML
	public void onMenuAgendaConsultaAction() {
		System.out.println("Deu certo");
	}
	@FXML
	public void onMenuMostrarAgendamentosAction() {
		System.out.println("Deu certo");
	}
	@FXML
	public void onMenuPerfilAction() {
		loadView("/gui/Perfil.fxml");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	private void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox =(VBox)((ScrollPane)mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
		}catch(IOException e) {
			
		}
		
	}

}
