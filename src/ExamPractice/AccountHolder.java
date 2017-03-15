package ExamPractice;
class AccountHolder{
	private int AccountNumber;
	private String HolderName;
	private double ContactNumber;
	private double AvailableBalance;
	private double MinBalance;
	private String AccountHolderType;
	private double interest;

	public AccountHolder(int AccountNumber,String HolderName,double ContactNumber,double DepositeAmount,double MinBalance,String AccountHolderType){
		//initialize all the varible with the argument's value
		//initialize interest 10% of the Deposite Amount
		this.AccountNumber=AccountNumber;
		this.HolderName=HolderName;
		this.ContactNumber=ContactNumber;
		this.AvailableBalance=DepositeAmount;
		this.interest=(DepositeAmount*(10/100));
		this.MinBalance=MinBalance;
		this.AccountHolderType=AccountHolderType;
	}

	public AccountHolder(int AccountNumber,String HolderName,double ContactNumber,String AccountHolderType){
		//Set min balance,interest and Available balance as null;
		this.AccountNumber=AccountNumber;
		this.HolderName=HolderName;
		this.ContactNumber=ContactNumber;
		this.AvailableBalance=0;
		this.interest=0.0;
		this.MinBalance=0.0;
		this.AccountHolderType=AccountHolderType;

	}
	public int getAccountNumber() {
		return AccountNumber;
	}

	public String getHolderName() {
		return HolderName;
	}

	public double getContactNumber() {
		return ContactNumber;
	}

	public double getAvailableBalance() {
		return AvailableBalance;
	}

	public double getMinBalance() {
		return MinBalance;
	}

	public String getAccountType() {
		return AccountHolderType;
	}
	public void deposite(double amount){
		//Add amount to the available amount and add 10% interest 
		AvailableBalance+=amount;
		AvailableBalance+=(AvailableBalance*(10/100));
	}
	public void withdrawn(double amount)throws InSufficientBalance {
		if((AvailableBalance-amount)>MinBalance)
			AvailableBalance-=amount;
		else
			throw new InSufficientBalance("Balnce is not enough to withdraw");
	}
	public boolean isMinBalance(){
		return AvailableBalance<MinBalance?true:false;
	}
}
