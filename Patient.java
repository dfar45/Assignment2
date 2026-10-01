package assignment2;

public class Patient {
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyNumber;
	
	public Patient() {
		firstName = "";
		middleName = "";
		lastName = "";
		address = "";
		city = "";
		state = "";
		zip = 0;
		phoneNumber = "";
		emergencyName = "";
		emergencyNumber = "";
	}
	public Patient(String f, String m, String l) {
		firstName = f;
		middleName = m;
		lastName = l;
	}
	public Patient(String f, String m, String l, String a, String c, String s,
				   int z, String phone, String eName, String ePhone) {
		firstName = f;
		middleName = m;
		lastName = l;
		address = a;
		city = c;
		state = s;
		zip = z;
		phoneNumber = phone;
		emergencyName = eName;
		emergencyNumber = ePhone;
	}
	
	public void setFirst(String f) {
		firstName = f;
	}
	public String getFirst() {
		return firstName;
	}
	public void setMiddle(String m) {
		middleName = m;
	}
	public String getMiddle() {
		return middleName;
	}
	public void setLast(String l) {
		lastName = l;
	}
	public String getLast() {
		return lastName;
	}
	public void setAddress(String a) {
		address = a;
	}
	public String getAddress() {
		return address;
	}
	public void setCity(String c) {
		city = c;
	}
	public String getCity() {
		return city;
	}
	public void setState(String s) {
		state = s;
	}
	public String getState() {
		return state;
	}
	public void setZip(int z) {
		zip = z;
	}
	public int getZip() {
		return zip;
	}
	public void setPhoneNumber(String P) {
		phoneNumber = P;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setEmergencyContact(String E) {
		emergencyName = E;
	}
	public String getEmergencyContact() {
		return emergencyName;
	}
	public void setEmergencyNumber(String En) {
		emergencyNumber = En;
	}
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	public String buildFullName() {
		String fullName = firstName+ " "+middleName+" "+lastName;
		return fullName;
	}
	public String buildAddress() {
		String home = address+" "+city+" "+state+" "+zip;
		return home;
	}
	public String buildEmergencyContact() {
		return emergencyName+" "+emergencyNumber;
	}
	public String toString() {
		return ("Name: "+buildFullName()
			+"\nAddress: "+buildAddress()
			+"\nPhone Number: "+phoneNumber
			+"\nEmergency Contact: "+buildEmergencyContact());
	}
}
