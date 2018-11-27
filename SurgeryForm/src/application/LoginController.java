package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
	@FXML
	private Label lblstatus;

	@FXML
	private TextField txtusername;

	@FXML
	private TextField txtpassword;

	public void Login(ActionEvent ev) throws IOException {
		if (txtusername.getText().equals("user") && txtpassword.getText().equals("pass")) {
			lblstatus.setText("Login Success");
			Parent tableviewParent = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene tableViewScene = new Scene(tableviewParent, 1064, 602);
			tableViewScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage window = (Stage) ((Node) ev.getSource()).getScene().getWindow();
			window.setScene(tableViewScene);
			window.show();
		} else {
			lblstatus.setText("Login Fail");

		}

	}
}
