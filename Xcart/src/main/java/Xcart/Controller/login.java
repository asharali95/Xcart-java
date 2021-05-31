package Xcart.Controller;

import java.io.IOException;
import Xcart.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class login {
	public login() {
		
	}
	
	@FXML
	private Button loginBtn;
	@FXML
	private Label errormsg;
	@FXML
	private TextField emailAddress;
	@FXML
	private PasswordField password;
	
	public void userLogin(ActionEvent event) throws IOException{
		Main m = new Main();
		if(emailAddress.getText().toString().equals("ashar@gmail.com") && password.getText().toString().equals("pass123")) {
			errormsg.setText("Success!");
			errormsg.setTextFill(Color.GREEN);

            m.changeScene("afterLogin.fxml");
        }

        else if(emailAddress.getText().isEmpty() && password.getText().isEmpty()) {
        	errormsg.setText("Please enter your data.");
        }
		else {
			errormsg.setText("Wrong username or password!");
		}
	}
	
}
