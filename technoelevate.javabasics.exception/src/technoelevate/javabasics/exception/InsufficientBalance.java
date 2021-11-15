package technoelevate.javabasics.exception;
public class InsufficientBalance extends Exception {
	String msg;

	public InsufficientBalance(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
