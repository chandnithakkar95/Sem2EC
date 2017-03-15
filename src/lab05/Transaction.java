package lab05;

import java.util.ArrayList;
import java.util.Calendar;

public class Transaction {
	private String type;
	private String narration;
	private int year;
	private int month;
	private int day;
	private double amount;
	private long AcNo;
 ArrayList<Transaction> tdetails;
	public Transaction() {
		// TODO Auto-generated constructor stub
		tdetails=new ArrayList<>();
	}
	public Transaction(long accno, double tamount,String nrt, String sType) {
		// TODO Auto-generated constructor stub
		
		setType(sType);
		setNarration(nrt);
		setDay(Calendar.DATE);
		setMonth(Calendar.MONTH);
		setYear(Calendar.YEAR);
		setNarration(nrt);
		setAmount(tamount);
		AcNo=accno;
		
	
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}
	public void addTransaction(Transaction t){
		tdetails.add(t);
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
