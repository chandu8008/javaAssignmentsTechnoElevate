package technoelevate.javabasics.exception;

public class MainMethod {
public static void main(String[] args) throws InsufficientBalance {
	BankAccount account = new BankAccount(5000);
	account.withdraw(2000);
}
}
