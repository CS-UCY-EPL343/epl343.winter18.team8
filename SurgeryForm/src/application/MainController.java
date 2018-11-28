package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
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
	private TextArea txt49;
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
	private DatePicker doS;
	@FXML
	private DatePicker doB;
	@FXML
	private Button submitSurgery;
	@FXML
	private Button backToCalendar;
	static Surgery surgery;
	
	public void initialize() {
		if (surgery != null) {
		txt1.setText(surgery.getString(0));
		txt2.setText(surgery.getString(1));
		txt3.setText(surgery.getString(2));
		txt4.setText(surgery.getString(3));
		txt5.setText(surgery.getString(4));
		txt6.setText(surgery.getString(5));
		txt7.setText(surgery.getString(6));
		txt8.setText(surgery.getString(7));
		txt9.setText(surgery.getString(8));
		txt10.setText(surgery.getString(9));
		txt11.setText(surgery.getString(10));
		txt12.setText(surgery.getString(11));
		txt13.setText(surgery.getString(12));
		txt14.setText(surgery.getString(13));
		txt15.setText(surgery.getString(14));
		txt16.setText(surgery.getString(15));
		txt17.setText(surgery.getString(16));
		txt18.setText(surgery.getString(17));
		txt19.setText(surgery.getString(18));
		txt20.setText(surgery.getString(19));
		txt21.setText(surgery.getString(20));
		txt22.setText(surgery.getString(21));
		txt23.setText(surgery.getString(22));
		txt24.setText(surgery.getString(23));
		txt25.setText(surgery.getString(24));
		txt26.setText(surgery.getString(25));
		txt27.setText(surgery.getString(26));
		txt28.setText(surgery.getString(27));
		txt29.setText(surgery.getString(28));
		txt30.setText(surgery.getString(29));
		txt31.setText(surgery.getString(30));
		txt32.setText(surgery.getString(31));
		txt33.setText(surgery.getString(32));
		txt34.setText(surgery.getString(33));
		txt35.setText(surgery.getString(34));
		txt36.setText(surgery.getString(35));
		txt37.setText(surgery.getString(36));
		txt38.setText(surgery.getString(37));
		txt39.setText(surgery.getString(38));
		txt40.setText(surgery.getString(39));
		txt41.setText(surgery.getString(40));
		txt42.setText(surgery.getString(41));
		txt43.setText(surgery.getString(42));
		txt44.setText(surgery.getString(43));
		txt45.setText(surgery.getString(44));
		txt46.setText(surgery.getString(45));
		txt47.setText(surgery.getString(46));
		txt48.setText(surgery.getString(47));
		txt49.setText(surgery.getString(48));
		male.setSelected(surgery.getB(3));
		female.setSelected(surgery.getB(4));
		anes1.setSelected(surgery.getB(0));
		anes2.setSelected(surgery.getB(1));
		anes3.setSelected(surgery.getB(2));
		doS.setValue(surgery.getDateLocal(surgery.getDateOfSurgery()));
		doB.setValue(surgery.getDateLocal(surgery.getDate2()));
		}
		surgery=null;
	}
	@FXML
	protected void loadCalendar(ActionEvent ev) throws IOException {
		Parent tableviewParent = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene tableViewScene = new Scene(tableviewParent, 1080, 600);
		tableViewScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage window = (Stage) ((Node) ev.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
		
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
		doS.setValue(null);
		doB.setValue(null);
	}

	public boolean isFill(){
		return !(this.txt1.getText().equals("")) &&
			   !(this.txt2.getText().equals("")) &&
			   !(this.txt4.getText().equals("")) &&
			   !(this.txt6.getText().equals("")) &&
			   !(this.txt7.getText().equals("")) &&
			   !(this.txt8.getText().equals("")) &&
			   !(this.txt9.getText().equals("")) &&
			   !(this.txt10.getText().equals("")) &&
			   !(this.txt12.getText().equals("")) &&
			   !(this.txt13.getText().equals("")) &&
			   !(this.txt14.getText().equals("")) &&
			   !(this.txt15.getText().equals("")) &&
			   !(this.txt16.getText().equals("")) &&
			   !(this.txt18.getText().equals("")) &&
			   !(this.txt25.getText().equals("")) &&
			   !(this.txt29.getText().equals("")) &&
			   !(this.txt30.getText().equals("")) &&
			   !(this.txt31.getText().equals("")) &&
			   !(this.txt33.getText().equals("")) &&
			   !(this.txt34.getText().equals("")) &&
			   !(this.txt35.getText().equals("")) &&
			   !(this.txt36.getText().equals("")) &&
			   !(this.txt38.getText().equals("")) &&
			   !(this.txt40.getText().equals("")) &&
			   !(this.txt41.getText().equals("")) &&
			   !(this.txt42.getText().equals("")) &&
			   !(this.txt43.getText().equals("")) &&
			   !(this.txt44.getText().equals("")) &&
			   !(this.txt45.getText().equals("")) &&
			   !(this.txt46.getText().equals("")) &&
			   !(this.txt47.getText().equals("")) &&
			   !(this.txt48.getText().equals("")) &&
			   ((this.anes1.isSelected()) || this.anes2.isSelected() || this.anes3.isSelected()) &&
			   (this.male.isSelected() || this.female.isSelected()) &&
			   !(this.doS.getValue()==null) &&
			   !(this.doB.getValue()==null);
	}


	public void submitSurgeryForm(ActionEvent ev) {
		if (!isFill()){
			//System.out.println("You have to fill it.");
			//System.exit(0);
			Stage window = new Stage();

			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle("Surgery Form Error");
			window.setMinWidth(250);
			Label confirmLabel = new Label();
			confirmLabel.setText("You have to fill all the data");
			Button closeButton=new Button("Return");
			closeButton.setOnAction(e->window.close());
			VBox layout =new VBox(10);
			layout.getChildren().addAll(confirmLabel,closeButton);
			layout.setAlignment(Pos.CENTER);
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
			
			
		}
		else {
		LocalDate ld = doS.getValue();
		Instant c1 = Instant.from(ld.atStartOfDay(ZoneId.systemDefault()));
		Date date = Date.from(c1);
		LocalDate ld2 = doB.getValue();
		Instant c2 = Instant.from(ld2.atStartOfDay(ZoneId.systemDefault()));
		Date doB = Date.from(c2);
		String[] detail = new String[49];
		detail[0] = txt1.getText().toString();
		detail[1] = txt2.getText().toString();
		detail[2] = txt3.getText().toString();
		detail[3] = txt4.getText().toString();
		detail[4] = txt5.getText().toString();
		detail[5] = txt6.getText().toString();
		detail[6] = txt7.getText().toString();
		detail[7] = txt8.getText().toString();
		detail[8] = txt9.getText().toString();
		detail[9] = txt10.getText().toString();
		detail[10] = txt11.getText().toString();
		detail[11] = txt12.getText().toString();
		detail[12] = txt13.getText().toString();
		detail[13] = txt14.getText().toString();
		detail[14] = txt15.getText().toString();
		detail[15] = txt16.getText().toString();
		detail[16] = txt17.getText().toString();
		detail[17] = txt18.getText().toString();
		detail[18] = txt19.getText().toString();
		detail[19] = txt20.getText().toString();
		detail[20] = txt21.getText().toString();
		detail[21] = txt22.getText().toString();
		detail[22] = txt23.getText().toString();
		detail[23] = txt24.getText().toString();
		detail[24] = txt25.getText().toString();
		detail[25] = txt26.getText().toString();
		detail[26] = txt27.getText().toString();
		detail[27] = txt28.getText().toString();
		detail[28] = txt29.getText().toString();
		detail[29] = txt30.getText().toString();
		detail[30] = txt31.getText().toString();
		detail[31] = txt32.getText().toString();
		detail[32] = txt33.getText().toString();
		detail[33] = txt34.getText().toString();
		detail[34] = txt35.getText().toString();
		detail[35] = txt36.getText().toString();
		detail[36] = txt37.getText().toString();
		detail[37] = txt38.getText().toString();
		detail[38] = txt39.getText().toString();
		detail[39] = txt40.getText().toString();
		detail[40] = txt41.getText().toString();
		detail[41] = txt42.getText().toString();
		detail[42] = txt43.getText().toString();
		detail[43] = txt44.getText().toString();
		detail[44] = txt45.getText().toString();
		detail[45] = txt46.getText().toString();
		detail[46] = txt47.getText().toString();
		detail[47] = txt48.getText().toString();
		detail[48] = txt49.getText().toString();
		boolean [] b = { anes1.isSelected(),anes2.isSelected(),anes3.isSelected(),male.isSelected(),female.isSelected()};
		long milis=Integer.parseInt(detail[31])*1000L*60L*60L+Integer.parseInt(detail[48])*1000L*60L+date.getTime();
		date=new Date(milis);
		Surgery s = new Surgery(detail,date,doB,b,CalendarController.surgeries.size()+1);
		CalendarController.addToSurgeriesArray(s);
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

}
