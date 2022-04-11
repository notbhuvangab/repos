package practice.java.exceptions;


public class IllegalDrinkingAgeException extends Exception{

	IllegalDrinkingAgeException(int age){
		super(age + " is below 21. Therefore it is illegal to drink");
	}
	
}
