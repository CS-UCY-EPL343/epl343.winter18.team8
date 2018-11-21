package application;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainController {

	@FXML
	private Button reset;
	@FXML
	private TextArea txt1;
	@FXML
	private TextArea txt2;
	@FXML
	private TextArea txt3;
	@FXML
	private TextArea txt4;
	@FXML
	private TextArea txt5;
	@FXML
	private TextArea txt6;
	@FXML
	private TextArea txt7;
	@FXML
	private TextArea txt8;
	@FXML
	private TextArea txt9;
	@FXML
	private TextArea txt10;
	@FXML
	private TextArea txt11;
	@FXML
	private TextArea txt12;
	@FXML
	private TextArea txt13;
	@FXML
	private TextArea txt14;
	@FXML
	private TextArea txt15;
	@FXML
	private TextArea txt16;
	@FXML
	private TextArea txt17;
	@FXML
	private TextArea txt18;
	@FXML
	private TextArea txt19;
	@FXML
	private TextArea txt20;
	@FXML
	private TextArea txt21;
	@FXML
	private TextArea txt22;
	@FXML
	private TextArea txt23;
	@FXML
	private TextArea txt24;
	@FXML
	private TextArea txt25;
	@FXML
	private TextArea txt26;
	@FXML
	private TextArea txt27;
	@FXML
	private TextArea txt28;
	@FXML
	private TextArea txt29;
	@FXML
	private TextArea txt30;
	@FXML
	private TextArea txt31;
	@FXML
	private TextArea txt32;
	@FXML
	private TextArea txt33;
	@FXML
	private TextArea txt34;
	@FXML
	private TextArea txt35;
	@FXML
	private TextArea txt36;
	@FXML
	private TextArea txt37;
	@FXML
	private TextArea txt38;
	@FXML
	private TextArea txt39;
	@FXML
	private TextArea txt40;
	@FXML
	private TextArea txt41;
	@FXML
	private TextArea txt42;
	@FXML
	private TextArea txt43;
	@FXML
	private TextArea txt44;
	@FXML
	private TextArea txt45;
	@FXML
	private TextArea txt46;
	@FXML
	private TextArea txt47;
	@FXML
	private TextArea txt48;
	@FXML
	private RadioButton anes1;
	@FXML
	private RadioButton anes2;
	@FXML
	private RadioButton anes3;
	@FXML
	private RadioButton male;
	@FXML
	private RadioButton female;
	@FXML
	private DatePicker date1;
	@FXML
	private DatePicker date2;
	@FXML
	private Button submitSurgery;
	@FXML
	private Button loadCalendar;
	@FXML
	private AnchorPane rootPane;

	@FXML
	private void loadCalendar(ActionEvent ev)throws IOException{
		Parent tableviewParent = FXMLLoader.load(getClass().getResource("/application/Calendar.fxml"));
		Scene tableViewScene = new Scene(tableviewParent,400,400);


		tableViewScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		Stage window = (Stage) ((Node)ev.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}

	@FXML
	private void handleButtonAction(ActionEvent event) {

	}

	public void resetText(ActionEvent ev) {
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt4.setText("");
		txt5.setText("");
		txt6.setText("");
		txt7.setText("");
		txt8.setText("");
		txt9.setText("");
		txt10.setText("");
		txt11.setText("");
		txt12.setText("");
		txt13.setText("");
		txt14.setText("");
		txt15.setText("");
		txt16.setText("");
		txt17.setText("");
		txt18.setText("");
		txt19.setText("");
		txt20.setText("");
		txt21.setText("");
		txt22.setText("");
		txt23.setText("");
		txt24.setText("");
		txt25.setText("");
		txt26.setText("");
		txt27.setText("");
		txt28.setText("");
		txt29.setText("");
		txt30.setText("");
		txt31.setText("");
		txt32.setText("");
		txt33.setText("");
		txt34.setText("");
		txt34.setText("");
		txt35.setText("");
		txt36.setText("");
		txt37.setText("");
		txt38.setText("");
		txt39.setText("");
		txt40.setText("");
		txt41.setText("");
		txt42.setText("");
		txt43.setText("");
		txt44.setText("");
		txt45.setText("");
		txt46.setText("");
		txt47.setText("");
		txt48.setText("");
		male.setSelected(false);
		female.setSelected(false);
		anes1.setSelected(false);
		anes2.setSelected(false);
		anes3.setSelected(false);
		date1.setValue(null);
		date2.setValue(null);
	}

	public void submitSurgeryForm(ActionEvent ev) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Surgery Form confirm");
		window.setMinWidth(250);
		Label confirmLabel = new Label();
		confirmLabel.setText("Surgery form succesfully created!!!");
		Button closeButton=new Button("Exit");
		closeButton.setOnAction(e->window.close());
		VBox layout =new VBox(10);
		layout.getChildren().addAll(confirmLabel,closeButton);
		layout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}

}
