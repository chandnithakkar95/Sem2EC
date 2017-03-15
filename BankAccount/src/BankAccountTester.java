
public class BankAccountTester {

    public static void main(String[] args) throws DailyLimitException, InsufficientBalanceException {
       	BankAccount obj = new BankAccount();
    	obj.deposit(5000);
    	obj.withdraw(300);
    	System.out.println(obj.getBalance());
    }

}
