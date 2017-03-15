import java.util.Calendar;

public class Transaction {
	
	
	private Calendar date;
	private String narration;
	private double tamount;
	private double amount;
	
	public Transaction() {
		this.date = Calendar.getInstance();
		this.narration = null;
	}
	
	public Transaction(String narration,double type,double amount) {
		this();
		this.narration = narration;
		this.tamount = type;
		this.amount = amount;
	}
	
	public void setDate(Calendar date){
		this.date = date;
	}
	
	public Calendar getDate(){
		return this.date;
	}
	public void setNarration(String narration){
		this.narration = narration;
	}
	
	public String getNarration(){
		return this.narration;
	}
	
	public void setTransactionamount(double amt){
		this.tamount = amt;
	}
	
	public Double getTransactionAmount(){
		return this.tamount;
	}
	
	public void setAmount(String narration){
		this.narration = narration;
	}
	
	public double getAmount(){
		return this.amount;
	}

	public void  displayType(){
		System.out.println("1. credit");
		System.out.println("2. Debit");
	}
}
