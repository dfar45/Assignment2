package assignment2;

public class Procedure {

	private String procedureName;
	private String date;
	private String practitionerName;
	private double charges;
	private String category;
	public Procedure() {
		procedureName = "";
		date = "";
		practitionerName = "";
		charges = 0;
		category = "unknown";
	}
	public Procedure(String pn, String d) {
		procedureName = pn;
		date = d;
	}
	public Procedure(String pro, String date, String p, double charges, String category) {
		procedureName = pro;
		this.date = date;
		practitionerName = p;
		this.charges = charges;
		this.category = category;
	}
	public void setProcedure(String pro) {
		procedureName = pro;
	}
	public String getProcedure() {
		return procedureName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setPractitioner(String pra) {
		practitionerName = pra;
	}
	public String getPractitioner() {
		return practitionerName;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	public double getCharges() {
		return charges;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public String toString() {
		return getProcedure()+"   "+getDate()+"     "+getPractitioner()
		+"   $"+getCharges()+"  "+getCategory();
	}
}
