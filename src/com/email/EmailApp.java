package com.email;


import javax.sound.midi.Soundbank;

import com.email.entityclass.Email;

public class EmailApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Email email = new Email("opi", "saha");
				email.setAlternateEmail("opi@gmail.com");
				System.out.println(email.showDetails());
			 
		
	} 

}
