package lab05;

public class BankAccountTester {

    public static void main(String[] args) {
        
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(2000);
        try {
            harrysChecking.withdraw(5000);
        }
        catch( InsuffBalanceException e ) {
            System.out.println( "Insufficient balance");
            System.out.println( e.getMessage() );
       }
        catch( DailyLimitException e ) {
            System.out.println( "Daily Limits Exceeded: " + e.getMessage() );
       }
        catch( Exception e ) {
            System.out.println( "Something else went wrong: " + e.getMessage() );
       }
        finally {
            System.out.println( "This is always executed");
        }

        System.out.println(harrysChecking.getBalance());

    }

}
