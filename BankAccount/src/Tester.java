import java.util.Calendar;

public class Tester {
	public static void main(String[] args){
		Transaction t = new Transaction();
		System.out.println(t.getDate().get(Calendar.MONTH));
	}
}
