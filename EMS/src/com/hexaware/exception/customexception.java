package com.hexaware.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class customexception {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String un, pwd;
			System.out.println("Enter username");
			un = br.readLine();
			System.out.println("Enter password");
			pwd = br.readLine();

			if (un.equals("Prarthana") && pwd.equals("9955")) {
				System.out.println("Welcome " + un);
			} else {
				throw new EmployeeNotFoundException("Check your Credentials");
			}

		} catch (EmployeeNotFoundException Enfe) {
			System.out.println("From ENFE catch...");
			System.out.println(Enfe);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("From Finally");
		}

		System.out.println("Main Ends");

	}

}

