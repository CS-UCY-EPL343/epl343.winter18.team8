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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;

public class CalendarController{
	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;
	@FXML
	private TextField txt50;
	@FXML
	protected Text date1;
	@FXML
	protected Text date2;
	@FXML
	protected TextField Monday0;
	@FXML
	protected TextField Monday3;
	@FXML
	protected TextField Monday6;
	@FXML
	protected TextField Monday9;
	@FXML
	protected TextField Monday12;
	@FXML
	protected TextField Monday15;
	@FXML
	protected TextField Monday18;
	@FXML
	protected TextField Monday21;
	@FXML
	protected TextField Tuesday0;
	@FXML
	protected TextField Tuesday3;
	@FXML
	protected TextField Tuesday6;
	@FXML
	protected TextField Tuesday9;
	@FXML
	protected TextField Tuesday12;
	@FXML
	protected TextField Tuesday15;
	@FXML
	protected TextField Tuesday18;
	@FXML
	protected TextField Tuesday21;
	@FXML
	protected TextField Wednesday0;
	@FXML
	protected TextField Wednesday3;
	@FXML
	protected TextField Wednesday6;
	@FXML
	protected TextField Wednesday9;
	@FXML
	protected TextField Wednesday12;
	@FXML
	protected TextField Wednesday15;
	@FXML
	protected TextField Wednesday18;
	@FXML
	protected TextField Wednesday21;
	@FXML
	protected TextField Thursday0;
	@FXML
	protected TextField Thursday3;
	@FXML
	protected TextField Thursday6;
	@FXML
	protected TextField Thursday9;
	@FXML
	protected TextField Thursday12;
	@FXML
	protected TextField Thursday15;
	@FXML
	protected TextField Thursday18;
	@FXML
	protected TextField Thursday21;
	@FXML
	protected TextField Friday0;
	@FXML
	protected TextField Friday3;
	@FXML
	protected TextField Friday6;
	@FXML
	protected TextField Friday9;
	@FXML
	protected TextField Friday12;
	@FXML
	protected TextField Friday15;
	@FXML
	protected TextField Friday18;
	@FXML
	protected TextField Friday21;
	@FXML
	protected TextField Saturday0;
	@FXML
	protected TextField Saturday3;
	@FXML
	protected TextField Saturday6;
	@FXML
	protected TextField Saturday9;
	@FXML
	protected TextField Saturday12;
	@FXML
	protected TextField Saturday15;
	@FXML
	protected TextField Saturday18;
	@FXML
	protected TextField Saturday21;
	@FXML
	protected TextField Sunday0;
	@FXML
	protected TextField Sunday3;
	@FXML
	protected TextField Sunday6;
	@FXML
	protected TextField Sunday9;
	@FXML
	protected TextField Sunday12;
	@FXML
	protected TextField Sunday15;
	@FXML
	protected TextField Sunday18;
	@FXML
	protected TextField Sunday21;

	static int index=0;
	public void DeleteSurgery(ActionEvent ev) throws IOException{
		String Search = txt50.getText().toString();
		for (int i=0;i<surgeries.size();i++){
			if (surgeries.get(i).getName().equals(Search))
				surgeries.remove(i);
		}
		AddSurgeries();
	}
	public static ArrayList <Surgery> surgeries = new ArrayList<Surgery>();
	long date_in_milis = (new Date()).getTime();
	long date_in_milis_2 = (new Date()).getTime();

	public static void addToSurgeriesArray(Surgery s) {
		surgeries.add(s);
	}
	public ArrayList<Surgery> getSurgeries() {
		return surgeries;
	}

	public void setSurgeries(ArrayList<Surgery> surgeries) {
		this.surgeries = surgeries;
	}
	public void FindSurgery(ActionEvent ev) throws IOException {
		String Search = txt50.getText().toString();
		Surgery d = null;
		for (int i=0;i<surgeries.size();i++){
			if (surgeries.get(i).getName().equals(Search))
				d = surgeries.get(i);
		}
		MainController.surgery = d;
		Parent tableviewParent = FXMLLoader.load(getClass().getResource("/application/SurgeryForm.fxml"));
		Scene tableViewScene = new Scene(tableviewParent, 600, 600);
		tableViewScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage) ((Node) ev.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
	@FXML
	void everclear(){
		Monday0.setText("");
		Monday3.setText("");
		Monday6.setText("");
		Monday9.setText("");
		Monday12.setText("");
		Monday15.setText("");
		Monday18.setText("");
		Monday21.setText("");
		Tuesday0.setText("");
		Tuesday3.setText("");
		Tuesday6.setText("");
		Tuesday9.setText("");
		Tuesday12.setText("");
		Tuesday15.setText("");
		Tuesday18.setText("");
		Tuesday21.setText("");
		Wednesday0.setText("");
		Wednesday3.setText("");
		Wednesday6.setText("");
		Wednesday9.setText("");
		Wednesday12.setText("");
		Wednesday15.setText("");
		Wednesday18.setText("");
		Wednesday21.setText("");
		Thursday0.setText("");
		Thursday3.setText("");
		Thursday6.setText("");
		Thursday9.setText("");
		Thursday12.setText("");
		Thursday15.setText("");
		Thursday18.setText("");
		Thursday21.setText("");
		Friday0.setText("");
		Friday3.setText("");
		Friday6.setText("");
		Friday9.setText("");
		Friday12.setText("");
		Friday15.setText("");
		Friday18.setText("");
		Friday21.setText("");	
	}
	
	@SuppressWarnings("deprecation")
	@FXML
	void AddSurgeries(){
			everclear();
			for(int i=0;i<surgeries.size();i++){
				Surgery s = surgeries.get(i);
				if( (s.getDateOfSurgery().compareTo(new Date(date_in_milis)) >= 0) && (s.getDateOfSurgery().compareTo(new Date(date_in_milis_2)) <= 0)){
					//ara ine mesa sto range ara prepei na tin emfanisoume mesa sto calendar
					long time=	(s.getDateOfSurgery().getTime()+2L*60L*60L*1000L)%(1000L*24L*60L*60L);
					switch (s.getDateOfSurgery().getDay()){
					case 1 :if(time<(3*3600000)){
								Monday0.setText(surgeries.get(i).getName());	
							}
							else if(time<(6*3600000)){
								Monday3.setText(surgeries.get(i).getName());	
							}
							else if(time<(9*3600000)){
								Monday6.setText(surgeries.get(i).getName());	
							}
							else if(time<(12*3600000)){
								Monday9.setText(surgeries.get(i).getName());	
							}
							else if(time<(15*3600000)){
								Monday12.setText(surgeries.get(i).getName());	
							}
							else if(time<(18*3600000)){
								Monday15.setText(surgeries.get(i).getName());	
							}
							else if(time<(21*3600000)){
								Monday18.setText(surgeries.get(i).getName());	
							}
							else if(time<(24*3600000)){
								Monday21.setText(surgeries.get(i).getName());	
							}break;
					case 2 :if(time<(3*3600000)){
						Tuesday0.setText(surgeries.get(i).getName());	
					}
					else if(time<(6*3600000)){
						Tuesday3.setText(surgeries.get(i).getName());	
					}
					else if(time<(9*3600000)){
						Tuesday6.setText(surgeries.get(i).getName());	
					}
					else if(time<(12*3600000)){
						Tuesday9.setText(surgeries.get(i).getName());	
					}
					else if(time<(15*3600000)){
						Tuesday12.setText(surgeries.get(i).getName());	
					}
					else if(time<(18*3600000)){
						Tuesday15.setText(surgeries.get(i).getName());	
					}
					else if(time<(21*3600000)){
						Tuesday18.setText(surgeries.get(i).getName());	
					}
					else if(time<(24*3600000)){
						Tuesday21.setText(surgeries.get(i).getName());	
					}break;
					
					case 3 :if(time<(3*3600000)){
						Wednesday0.setText(surgeries.get(i).getName());	
					}
					else if(time<(6*3600000)){
						Wednesday3.setText(surgeries.get(i).getName());	
					}
					else if(time<(9*3600000)){
						Wednesday6.setText(surgeries.get(i).getName());	
					}
					else if(time<(12*3600000)){
						Wednesday9.setText(surgeries.get(i).getName());	
					}
					else if(time<(15*3600000)){
						Wednesday12.setText(surgeries.get(i).getName());	
					}
					else if(time<(18*3600000)){
						Wednesday15.setText(surgeries.get(i).getName());	
					}
					else if(time<(21*3600000)){
						Wednesday18.setText(surgeries.get(i).getName());	
					}
					else if(time<(24*3600000)){
						Wednesday21.setText(surgeries.get(i).getName());	
					}break;
					
					case 4 :if(time<(3*3600000)){
						Thursday0.setText(surgeries.get(i).getName());	
					}
					else if(time<(6*3600000)){
						Thursday3.setText(surgeries.get(i).getName());	
					}
					else if(time<(9*3600000)){
						Thursday6.setText(surgeries.get(i).getName());	
					}
					else if(time<(12*3600000)){
						Thursday9.setText(surgeries.get(i).getName());	
					}
					else if(time<(15*3600000)){
						Thursday12.setText(surgeries.get(i).getName());	
					}
					else if(time<(18*3600000)){
						Thursday15.setText(surgeries.get(i).getName());	
					}
					else if(time<(21*3600000)){
						Thursday18.setText(surgeries.get(i).getName());	
					}
					else if(time<(24*3600000)){
						Thursday21.setText(surgeries.get(i).getName());	
					}break;
					
					case 5 :if(time<(3*3600000)){
						Friday0.setText(surgeries.get(i).getName());	
					}
					else if(time<(6*3600000)){
						Friday3.setText(surgeries.get(i).getName());	
					}
					else if(time<(9*3600000)){
						Friday6.setText(surgeries.get(i).getName());	
					}
					else if(time<(12*3600000)){
						Friday9.setText(surgeries.get(i).getName());	
					}
					else if(time<(15*3600000)){
						Friday12.setText(surgeries.get(i).getName());	
					}
					else if(time<(18*3600000)){
						Friday15.setText(surgeries.get(i).getName());	
					}
					else if(time<(21*3600000)){
						Friday18.setText(surgeries.get(i).getName());	
					}
					else if(time<(24*3600000)){
						Friday21.setText(surgeries.get(i).getName());	
					}break;
					
					case 6 :if(time<(3*3600000)){
						Saturday0.setText(surgeries.get(i).getName());	
					}
					else if(time<(6*3600000)){
						Saturday3.setText(surgeries.get(i).getName());	
					}
					else if(time<(9*3600000)){
						Saturday6.setText(surgeries.get(i).getName());	
					}
					else if(time<(12*3600000)){
						Saturday9.setText(surgeries.get(i).getName());	
					}
					else if(time<(15*3600000)){
						Saturday12.setText(surgeries.get(i).getName());	
					}
					else if(time<(18*3600000)){
						Saturday15.setText(surgeries.get(i).getName());	
					}
					else if(time<(21*3600000)){
						Saturday18.setText(surgeries.get(i).getName());	
					}
					else if(time<(24*3600000)){
						Saturday21.setText(surgeries.get(i).getName());	
					}break;
					
					case 7 :if(time<(3*3600000)){
						Sunday0.setText(surgeries.get(i).getName());	
					}
					else if(time<(6*3600000)){
						Sunday3.setText(surgeries.get(i).getName());	
					}
					else if(time<(9*3600000)){
						Sunday6.setText(surgeries.get(i).getName());	
					}
					else if(time<(12*3600000)){
						Sunday9.setText(surgeries.get(i).getName());	
					}
					else if(time<(15*3600000)){
						Sunday12.setText(surgeries.get(i).getName());	
					}
					else if(time<(18*3600000)){
						Sunday15.setText(surgeries.get(i).getName());	
					}
					else if(time<(21*3600000)){
						Sunday18.setText(surgeries.get(i).getName());	
					}
					else if(time<(24*3600000)){
						Sunday21.setText(surgeries.get(i).getName());	
					}break;		
					
					}
					}

				}
	}
	
	@SuppressWarnings("deprecation")
	@FXML
	public void initialize() {
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
			date = new Date(date_in_milis_2);
		}
		date_in_milis= date_in_milis - (date_in_milis%(1000L*24L*60L*60L)+2L*60L*60L*1000L);
		StringTokenizer st = new StringTokenizer(date.toString(), " ");
		date1.setText(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
		date_in_milis_2 = date_in_milis + 7L * 1000L * 24L * 60L * 60L-1L;
		date = new Date(date_in_milis_2);
		StringTokenizer st2 = new StringTokenizer(date.toString(), " ");
		date2.setText(st2.nextToken() + " " + st2.nextToken() + " " + st2.nextToken());
		AddSurgeries();
	}
	@SuppressWarnings("deprecation")
	@FXML
	public void PreviousWeekB(ActionEvent event) {
		date_in_milis = date_in_milis - 7L * 1000L * 24L * 60L * 60L;
		Date date = new Date(date_in_milis+2L*1000L*60L*60L);
		String str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		StringTokenizer st = new StringTokenizer(date.toGMTString(), " ");
		date1.setText(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
		date_in_milis_2 = date_in_milis_2 -7L * 1000L * 24L * 60L * 60L;
		date = new Date(date_in_milis_2-2L*1000L*60L*60L);
		StringTokenizer st2 = new StringTokenizer(date.toGMTString(), " ");
		date2.setText(st2.nextToken() + " " + st2.nextToken() + " " + st2.nextToken());
		AddSurgeries();
	}
	@FXML
	public void NextWeekB(ActionEvent event) {
		date_in_milis = date_in_milis + 7L * 1000L * 24L * 60L * 60L;
		Date date = new Date(date_in_milis+2L*1000L*60L*60L);
		String str = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
		StringTokenizer st = new StringTokenizer(date.toString(), " ");
		date1.setText(st.nextToken() + " " + st.nextToken() + " " + st.nextToken());
		date_in_milis_2 = date_in_milis_2 + 7L * 1000L * 24L * 60L * 60L;
		date = new Date(date_in_milis_2-2L*1000L*60L*60L);
		StringTokenizer st2 = new StringTokenizer(date.toString(), " ");
		date2.setText(st2.nextToken() + " " + st2.nextToken() + " " + st2.nextToken());
		AddSurgeries();
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
	public void loadForm(){
		
	}
}
