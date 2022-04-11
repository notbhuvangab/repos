package practice.java.exceptions;


final class IllegalDrinkingAgeException extends RuntimeException{

	IllegalDrinkingAgeException(int age){
		super(age + " is below 21. Therefore it is illegal to drink");
	}
	
}
