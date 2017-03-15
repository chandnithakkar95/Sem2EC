package ExamPractice;

public class BankTester {
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.addAccountHolder(new AccountHolder(201612110, "Janvi", 223344,10050,500,"saving"));
		bank.addAccountHolder(new AccountHolder(201612014, "Chandni",223322,1000,200,"Current"));
		try {
		bank.depositeAmount(201612014,590);
		} catch (NoAccountFound | DepositeLimitExcced e) {
	//	 TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
		
			System.out.println(bank.CheckBalance(201612110));
		} catch (NoAccountFound e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	try
	{
		bank.withdrawnAmount(201612110,70);
	}
		 catch (NoAccountFound | InSufficientBalance | WithdrawnLimitExceed e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
	
	try {
		
		System.out.println(bank.CheckBalance(201612110));
	} catch (NoAccountFound e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
}
