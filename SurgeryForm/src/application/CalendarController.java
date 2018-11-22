package application;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.*;

public class CalendarController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextArea date1;
	@FXML
	private TextArea date2;

	long date_in_milis = System.currentTimeMillis();
	long date_in_milis_2 = System.currentTimeMillis();

	@FXML
	void initialize() throws java.text.ParseException {
		assert date1 != null : "fx:id=\"date1\" was not injected: check your FXML file 'Main.fxml'.";
		assert date2 != null : "fx:id=\"date2\" was not injected: check your FXML file 'Main.fxml'.";
		Date date = new Date(date_in_milis);
		String str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		while (true) {
			date = new Date(date_in_milis);
			str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
			if (str.equals("Monday")) {
				break;
			}
			date_in_milis = date_in_milis - 1000L * 24L * 60L * 60L;
		}
		StringTokenizer st = new StringTokenizer(date.toGMTString(), " ");
		date1.setText(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
		date_in_milis_2 = date_in_milis + 6L * 1000L * 24L * 60L * 60L;
		date = new Date(date_in_milis_2);
		StringTokenizer st2 = new StringTokenizer(date.toGMTString(), " ");
		date2.setText(st2.nextToken() + " " + st2.nextToken() + " " + st2.nextToken());
	}

	public void PreviousWeekB(ActionEvent event) {
		date_in_milis = date_in_milis - 7L * 1000L * 24L * 60L * 60L;
		Date date = new Date(date_in_milis);
		String str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		StringTokenizer st = new StringTokenizer(date.toGMTString(), " ");
		date1.setText(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
		date_in_milis_2 = date_in_milis + 6L * 1000L * 24L * 60L * 60L;
		date = new Date(date_in_milis_2);
		StringTokenizer st2 = new StringTokenizer(date.toGMTString(), " ");
		date2.setText(st2.nextToken() + " " + st2.nextToken() + " " + st2.nextToken());

	}

	public void NextWeekB(ActionEvent event) {
		date_in_milis = date_in_milis + 7L * 1000L * 24L * 60L * 60L;
		Date date = new Date(date_in_milis);
		String str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		StringTokenizer st = new StringTokenizer(date.toGMTString(), " ");
		date1.setText(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
		date_in_milis_2 = date_in_milis + 6L * 1000L * 24L * 60L * 60L;
		date = new Date(date_in_milis_2);
		StringTokenizer st2 = new StringTokenizer(date.toGMTString(), " ");
		date2.setText(st2.nextToken() + " " + st2.nextToken() + " " + st2.nextToken());

	}

	@FXML
	public void logOut(ActionEvent ev) throws IOException {
		Parent tableviewParent = FXMLLoader.load(getClass().getResource("/application/LoginScreenGui.fxml"));
		Scene tableViewScene = new Scene(tableviewParent, 600, 600);
		tableViewScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage) ((Node) ev.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}

	@FXML
	public void loadSurgeryForm(ActionEvent ev) throws IOException {
		Parent tableviewParent = FXMLLoader.load(getClass().getResource("/application/SurgeryForm.fxml"));
		Scene tableViewScene = new Scene(tableviewParent, 600, 600);
		tableViewScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage) ((Node) ev.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
}
