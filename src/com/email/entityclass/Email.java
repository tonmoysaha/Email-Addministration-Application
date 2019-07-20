package com.email.entityclass;
import java.util.Scanner;

public class Email {
	private String fristName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;

	public Email(String fristName, String lastName) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.department = askDepatment();
		System.out.println("fristname: "+ this.fristName+" lastName: "+this.lastName + " department: "+this.department );
	}

	private String askDepatment() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your department choice: ");
		System.out.println("1.CSE\n2.EEE\n3.ECE");
		int choice = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		String massage = "";
		switch (choice) {
		case 1:
			massage = "CSE";
			break;
		case 2:
			massage = "EEE";
			break;
		case 3:
			massage = "ECE";
			break;
		default:
			System.out.println("not found");
			break;
		}
		return massage;
		

	}

}
