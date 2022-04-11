package practice.java.exceptions;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		int x,y;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Input x:");
			x = sc.nextInt();
			System.out.print("Input y:");
			y = sc.nextInt();
			System.out.println(x/y);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("The second input number is 0");
		}
		
		finally {
			sc.close();
		}
	}

}
