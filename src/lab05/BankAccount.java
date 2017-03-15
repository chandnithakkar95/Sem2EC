package lab05;

public class BankAccount{
   public BankAccount()   {
       accno = next_accno++;
       balance = 0;
   }

    public long getAccno() {
        return accno;
    }
   
   public BankAccount(double initialBalance)   {
       accno = next_accno++;
       balance = initialBalance;
   }
   public Transaction deposit(double amount)   {
       double newBalance = balance + amount;
       balance = newBalance;
       Transaction t=new Transaction(accno,balance,"Debited","debit");
       return t;
       
   }
   public Transaction withdraw(double amount)
           throws DailyLimitException, InsuffBalanceException {
       double newBalance = balance - amount;
       if ( amount > 25000 )
           throw ( new DailyLimitException("Daily Limit Exceed") );
       else if ( amount > balance )
           throw ( new InsuffBalanceException("Balance is not sufficient") );
       balance = newBalance;
       Transaction t=new Transaction(accno,balance,"Credited","credit");
       return t;
   }
   public double getBalance()
   {
       return balance;
   }

   private final long accno;
   private double balance;
   private static long next_accno=10000;
public Transaction payIntrest(double intrestRate) {
	// TODO Auto-generated method stub
	return null;
}

   
}

class InsuffBalanceException extends Exception {
	public InsuffBalanceException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class DailyLimitException extends Exception {
	public DailyLimitException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}