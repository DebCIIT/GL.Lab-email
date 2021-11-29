package com.gl.service;
import java.util.Random;

import com.gl.model.*;

public class CredentialService {
	
	public String generateEmailAddress(Employee emp) {
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment().toLowerCase() + ".abc.com";
	}
	
	
	public String generatePassword() {
		
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
		}
		return new String(password);
	}
	
	public void showCredentials(Employee emp,String email, String password) {
		System.out.println("Dear " + emp.getFirstName() + ", your generated credentials are as follows:-");
		System.out.println("Email--> "+email);
		System.out.println("Pasword--> "+password);
		
	}
}

