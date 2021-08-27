package com.bridgelabz.javaregex;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Valid UserName (must have minimum 3 characters) :");
		String str = sc.nextLine();
		System.out.println("Enter a Valid LastName (must have minimum 3 characters) :");
		String str1 = sc.nextLine();
		String regex = "^[A-Z][a-z]{3,}";
		System.out.println("Enter a Valid Email :");
		String email = sc.nextLine();
		String regex2 = "^[a-z]{3,10}[.+][a-zA-Z]{0,10}[@][a-z]{2,10}(.+)$";
		System.out.println("Enter a Valid Phone Number :");
		String phone = sc.nextLine();
		String regex3 = "^[0-9]{2,5}\\s[0-9]{10}";
		System.out.println("Enter a Valid Password :");
		String pass = sc.nextLine();
		String regex4 = "^[a-zA-Z0-9]{8,}";
		
		if(str.matches(regex)) {
			System.out.println("Username is : "+str);
		}else {
			System.out.println("Please enter Valid Username");
		}
		
		if(str1.matches(regex)) {
			System.out.println("Lastname is : "+str1);
		}else {
			System.out.println("Please enter Valid Lastname");
		}
		
		if(email.matches(regex2)) {
			System.out.println("Email is : " +email);
		}else {
			System.out.println("Invalid");
		}
		
		if(phone.matches(regex3)) {
			System.out.println("Phone number is "+phone);
		}else {
			System.out.println("Invalid");
		}
		
		if(pass.matches(regex4)) {
			System.out.println("Password is Valid");
		}else {
			System.out.println("Invalid");
		}
		
		
	}
}
