package lab05.bank;

public class Account {
	private int AccountNumber;
	private String HolderName;
	private double ContactNumber;
	private double AvailableBalance;
	private double MinBalance;
	private String AccountHolderType;
	private double interest;
	public Account(int AccountNumber,String HolderName,double ContactNumber,double DepositeAmount,double MinBalance,String AccountHolderType){
		this.AccountNumber=AccountNumber;
		this.HolderName=HolderName;
		this.ContactNumber=ContactNumber;
		this.MinBalance=MinBalance;
		this.AccountHolderType=AccountHolderType;
		interest=(DepositeAmount*10)/100;
		AvailableBalance=DepositeAmount;
				
	}

	public Account(int AccountNumber,String HolderName,double ContactNumber,String AccountHolderType){
		this.AccountNumber=AccountNumber;
		this.HolderName=HolderName;
		this.ContactNumber=ContactNumber;
		this.AccountHolderType=AccountHolderType;
		interest=0;
		AvailableBalance=0;
		MinBalance=0;
	}

	public int getAccountNumber(){
		return AccountNumber;
	}
	public String getHolderName(){
		return HolderName;
	}
	public double getContactNumber(){
		return ContactNumber;
	}
	public double getAvailableBanlance(){
		return AvailableBalance;
	}
	public double getMinBalance(){ 
		return MinBalance;
	}
	
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public void setHolderName(String holderName) {
		HolderName = holderName;
	}

	public void setContactNumber(double contactNumber) {
		ContactNumber = contactNumber;
	}

	public void setAvailableBalance(double availableBalance) {
		AvailableBalance = availableBalance;
	}

	public void setMinBalance(double minBalance) {
		MinBalance = minBalance;
	}

	public void setAccountHolderType(String accountHolderType) {
		AccountHolderType = accountHolderType;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getAccountType(){
		return AccountHolderType;
	}
	public void deposite(double amount){
		AvailableBalance+=amount;
	}
	public void withdrawn(double amount)throws InSufficientBalanaceException {
		if((AvailableBalance-amount)<MinBalance){
			throw new InSufficientBalanaceException("Insufficient Balance");
		}
		else{
			AvailableBalance-=amount;
		}
	}
	public boolean isMinBalance(){
		if(AvailableBalance >= MinBalance){
			return true;
		}
		return false;
	}
}
