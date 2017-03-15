
@SuppressWarnings("serial")
public class DailyLimitException extends Exception{
	String msg=null;
	public DailyLimitException(String msg) {
		this.msg = msg;
	}
}
