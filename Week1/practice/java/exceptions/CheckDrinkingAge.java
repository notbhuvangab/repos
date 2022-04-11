package practice.java.exceptions;

import java.util.Scanner;

public class CheckDrinkingAge {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age:");
		age = sc.nextInt();
		
		try {
		if(age<21) {
			throw new IllegalDrinkingAgeException(age);
		}
		else {
			System.out.println("You are allowed to drink");
		}
		}
		catch(IllegalDrinkingAgeException id) {
			System.out.println(id);
		}
		finally {
			sc.close();
		}
	}

}
