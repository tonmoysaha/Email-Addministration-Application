package com.email.entityclass;
import java.util.Scanner;



public class Email {
	private String fristName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String email;
	private String companyname = "company.com";

	public Email(String fristName, String lastName) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		System.out.println("Email Created For new worker:  "+ this.fristName+" "+this.lastName+ "\nenter your Department code: ");
		this.department = askDepatment();
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println(" Your Password is: "+this.password);
		
		this.email = this.fristName.toLowerCase()+"."+this.lastName.toLowerCase() +"@"+this.department.toLowerCase()+"."+this.companyname;
	}

	private String askDepatment() {
		Scanner scanner = new Scanner(System.in);
		
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
	private String randomPassword(int lenght) {
		String passwordset = "ABCDEFGHIJKLMNOPQRS@#$";
		char[] password = new char[lenght];
		int rand = (int) (Math.random()* passwordset.length());
		for (int i = 0; i < lenght; i++) {
			password[i] = passwordset.charAt(rand);
		}
		return new String(password);
		
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	public void changePassword(String password) {
		this.password = password ;
	}

	public String getPassword() {
		return this.password;
	}
	public String showDetails() {
		return  " Display Name: "+this.fristName+" "+this.lastName+
				"\n Your email is: "+this.email+
				"\n your laternate email is: "+ this.alternateEmail+
				"\n your mailbox capacity: "+this.mailBoxCapacity+"mb";
	}
	

}
