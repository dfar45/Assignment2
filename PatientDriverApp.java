package assignment2;

import java.util.Scanner;

public class PatientDriverApp {

	static Procedure createProcedure1() {
		Procedure p1 = new Procedure("Physical", "03/15/2024", "Dr. Peterson", 550.35, "Medium");
		return p1;
	}
	static Procedure createProcedure2() {
		Procedure p2 = new Procedure("X-ray", "03/16/2024", "Dr. Maclachlan", 378.30, "Low");
		return p2;
	}
	static Procedure createProcedure3() {
		Procedure p3 = new Procedure("Blood Test", "03/17/2024", "Dr. Howard", 1076.10, "High");
		return p3;
	}
	static void displayPatient(Patient patient) {
		patient = new Patient();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		patient.setFirst(keyboard.next());
		System.out.print("Enter your middle name: ");
		patient.setMiddle(keyboard.next());
		System.out.print("Enter your last name: ");
		patient.setLast(keyboard.next());
		System.out.print("Enter street address: ");
		keyboard.nextLine();
		patient.setAddress(keyboard.nextLine());
		System.out.print("Enter city: ");
		patient.setCity(keyboard.next());
		System.out.print("Enter state: ");
		patient.setState(keyboard.next());
		System.out.print("Enter zip: ");
		patient.setZip(keyboard.nextInt());
		System.out.print("Enter phone number: ");
		patient.setPhoneNumber(keyboard.next());
		System.out.print("Enter emergency contact name: ");
		keyboard.nextLine();
		patient.setEmergencyContact(keyboard.nextLine());
		System.out.print("Enter emergency contact phone: ");
		patient.setEmergencyNumber(keyboard.next());
		System.out.println();
		System.out.println("Patient Information:");
		System.out.println("--------------");
		System.out.println(patient.toString);
		char dash1 = patient.getPhoneNumber().charAt(3);
		char dash2 = patient.getPhoneNumber().charAt(7);
		System.out.print("Phone Valid: ");
		if(dash1 == '-' && dash2 == '-') {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		char dash3 = patient.getEmergencyNumber().charAt(3);
		char dash4 = patient.getEmergencyNumber().charAt(7);
		System.out.print("Emergency Phone Valid: ");
		if(dash3 == '-' && dash4 == '-') {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
	static void displayProcedureTable(Procedure p1, Procedure p2, Procedure p3) {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
	static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		double sum = p1.getCharges() + p2.getCharges() + p3.getCharges();
		return sum;
	}
	static double calculateAverageCharge(Procedure p1, Procedure p2, Procedure p3) {
		double average = calculateTotalCharges(p1, p2, p3) / 3;
		return average;
	}
	static Procedure findHighestChargeProcedure(Procedure p1, Procedure p2, Procedure p3) {
		if (p1.getCharges() > 1000){
			return p1;
		} else if (p2.getCharges() > 1000) {
			return p2;
		} else {
			return p3;
		}
	}
	static int countExpensiveProcedures (Procedure p1, Procedure p2, Procedure p3) {
		if (p1.getCharges() > 1000 || p2.getCharges() > 1000 || p3.getCharges() > 1000){
			return 1;
		} else if (p1.getCharges() > 1000 && p2.getCharges() > 1000 && p3.getCharges() > 1000) {
			return 3;
		} else if (p1.getCharges() < 1000 && p2.getCharges() < 1000 && p3.getCharges() < 1000){
			return 0;
		} else {
			return 2;
		}
	}
	public static void main(String[] args) {
		Patient p1 = new Patient();
		displayPatient(p1);
		System.out.println();
		System.out.print("Procedure    Date      Procedure");
		System.out.println("      Charge   Category");
		System.out.println("------------------------------------------");
		Procedure pr1 = createProcedure1();
		Procedure pr2 = createProcedure2();
		Procedure pr3 = createProcedure3();
		displayProcedureTable(pr1, pr2, pr3);
		System.out.println();
		System.out.println("Total Charges: $"+calculateTotalCharges(pr1, pr2, pr3));
		System.out.println("Average Charge: $"+calculateAverageCharge(pr1, pr2, pr3));
		System.out.println("Highest Charge Procedure: "+findHighestChargeProcedure(pr1, pr2, pr3).getProcedure());
		System.out.println("Number of Expensive Procedures: "+countExpensiveProcedures(pr1, pr2, pr3));
		System.out.println();
		p1.setFirst("Daniel");
		p1.setLast("Harris");
		
		System.out.print("This program was developed by a student: "+p1.getFirst()+" "+p1.getLast()+" 9/29/26");
		
		
	}
}
