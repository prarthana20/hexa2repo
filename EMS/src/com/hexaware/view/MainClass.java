package com.hexaware.view;

import java.util.Scanner;

import com.hexaware.controller.EmployeeController;
import com.hexaware.controller.EmployeeInterface;


public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to EMS");
		EmployeeInterface ec = new EmployeeController();
		try (Scanner obj = new Scanner(System.in)) {
			String ch =null;
			do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			int choice = obj.nextInt();
			switch (choice) {
			case 1: {
				ec.addEmployee();
				break;
			}
			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.sortByEmpnoUsingComparable();
				break;
			}
			case 4: {
				ec.sortByEnameUsingComparator();
				break;
			}
			default: {
				System.out.println("Enter a valid Choice !!!");
				break;
			}
			}
			System.out.println("Do u wnt to continue ? Y or y");
			ch = obj.next();
			
			}while(ch.equals("Y") || ch.equals("y"));
		}
		System.out.println("Thanks for using our system !!!");
		System.exit(0);

	}

}












