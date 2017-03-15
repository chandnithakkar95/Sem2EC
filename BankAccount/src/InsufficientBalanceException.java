
@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception{
	String msg = null;
	public InsufficientBalanceException(String msg){
		this.msg = msg;
	}
}
