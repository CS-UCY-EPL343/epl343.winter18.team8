
package application;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
public class Surgery {
	
	private Date dateOfSurgery;
	private Date date2;
	private String name;
	private int detsize = 49;
	private boolean [] b = new boolean[5];
	
	private String[] detail=new String [detsize];
	
	public Surgery(String[] detail,Date dateOfSurgery,Date date2,boolean[] b,int size){
		int i=0;
		for (i=0;i<detsize;i++){
			this.detail[i]=detail[i];
		}
		this.dateOfSurgery=dateOfSurgery;
		this.date2=date2;
		this.name= "Surgery " + size;
		for (i=0;i<5;i++){
			this.b[i]=b[i];
		}
	}
	
	public Date getDateOfSurgery() {
		return dateOfSurgery;
	}

	public void setDateOfSurgerie(Date dateOfSurgerie) {
		this.dateOfSurgery = dateOfSurgerie;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public String[] getDetail() {
		return detail;
	}

	public void setDetail(String[] detail) {
		this.detail = detail;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean getB(int i) {
		return b[i];
	}
	public LocalDate getDateLocal(Date date) {
		return dateOfSurgery.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	public void setB(boolean[] b) {
		this.b = b;
	}

	public int getSize(){
		return detsize;
	}
	public String getName(){
		return name;
	}
	public String getString(int i){
		return detail[i];
	}
	public void setString(int i, String text){
		detail[i]=text;
	}
}
