package com.bridgelabz.javaregex;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Valid UserName (must have minimum 3 characters) :");
		String str = sc.nextLine();
		String regex = "^?[A-Z][a-z]{2,25}";
		
//		System.out.println(str.matches(regex));
		
		if(str.matches(regex)) {
			System.out.println("Username is : "+str);
		}else {
			System.out.println("Please enter Valid Username");
		}
	}
}
