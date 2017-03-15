import java.util.ArrayList;

public class BankAccount{

   private final long accno;
   private double balance;
   private ArrayList<Transaction> arr;
   private static long next_accno=10000;
	   
   public BankAccount()   {
	   this.arr = new ArrayList<Transaction>();
       this.accno = next_accno++;
       this.balance = 0;
   }

    public long getAccno() {
        return this.accno;
    }
   
   public BankAccount(double initialBalance)   {
       this.accno = next_accno++;
       this.balance = initialBalance;
   }
   
   public void deposit(double amount)
   {
	   Transaction t = new Transaction();
	   t.setNarration("Dedit");
	   
	   arr.add(t);
	   
       double newBalance = this.balance + amount;
       this.balance = newBalance;
   }
   
   public void withdraw(double amount)
           throws DailyLimitException, InsufficientBalanceException {
	   
       double newBalance = this.balance - amount;
       if ( amount > 25000 )
           throw ( new DailyLimitException("Daily limit exceed!!") );
       else if ( amount > this.balance )
           throw ( new InsufficientBalanceException("Insufficient balance!!") );
       
       Transaction t = new Transaction();
	   t.setNarration("Credit");
	   arr.add(t);
       this.balance = newBalance;
   }
   
   public double getBalance()
   {
       return balance;
   }
   
   public double payInterest(double rate){
	   double temp = this.balance * rate;
	   this.balance = temp + this.balance;
	   return this.balance;
   }
   
   private void getMinimumBalanceInMonth(){
	   
   }
}