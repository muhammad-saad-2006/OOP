package banking; 
import util.PinValidator;

public class BankingSystem{
 	static final String storedAccountNumber = "123-4567-890";
	static final String storedPin = "2006";

	public static boolean authenticate(String accountNumber, String pin){
		return accountNumber.equals(storedAccountNumber) && pin.equals(storedPin);
	}
}
