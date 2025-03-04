package main;
import banking.BankingSystem;
import util.PinValidator;
import java.io.Console;

class BankApplication{
	public static void main(String[] args){
		Console console = System.console();

		PinValidator validator = new PinValidator();
		
		String accountNumber = console.readLine("Enter Account Number: ");
        	String pin = console.readLine("Enter PIN: ");

		if(!validator.isValid(pin)){
			System.out.print("Pin must have 4 characters");
			return;
		}
	
		if(BankingSystem.authenticate(accountNumber, pin)){
			System.out.print("Access granted!!");
		}
		else{
			System.out.print("Wrong Credentials... Access denied");
		}
	}
}
