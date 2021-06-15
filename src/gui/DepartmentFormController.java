package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
//Controles dos bot�es
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
//M�todos para tratar os eventos dos bot�es
	@FXML
	public void onBtSaveAction() {
		System.out.println("OnBtSaveAction");
	}

	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId); //aceitar apenas n�meros inteiros
		Constraints.setTextFieldMaxLength(txtName, 30);//determina a quantidade de caracteres
	}

}