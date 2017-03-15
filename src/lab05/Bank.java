package lab05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bank {
	Scanner sc;
	private String name;
	private double intrestRate;
	BankAccount b;
	HashMap<Long, BankAccount> log;
	ArrayList<Transaction> intrestLog;
	public Bank(String name,double rate) {
		// TODO Auto-generated constructor stub
		sc=new Scanner(System.in);
		b=new BankAccount();
		log=new HashMap<>();
		intrestLog=new ArrayList<>();
		this.setName(name);
		this.setIntrestRate(rate);
	}
	public void addAccount(){
		System.out.println("Enter Initial Balance");
		double inBal=sc.nextDouble();
		BankAccount newAccount=new BankAccount(inBal);
		log.put(b.getAccno(),newAccount);
	}
	public void close(long acNo){
		if(log.containsKey(acNo)){
			log.remove(acNo);
		}
	}
	public void payIntrest(int mon,int yr){
		BankAccount temp=new BankAccount();
		Set<Map.Entry<Long, BankAccount>> st=log.entrySet();
		Iterator<Map.Entry<Long, BankAccount>> ir=st.iterator();
		while(ir.hasNext()){
			Map.Entry<Long, BankAccount> m1=ir.next();
			Transaction t=m1.getValue().payIntrest(intrestRate);
			t.setMonth(mon);
			t.setYear(yr);
			t.setDay(30);
			intrestLog.add(t);
		}
	}
	
	public BankAccount find(Long ac){
		BankAccount temp =new BankAccount();
		if(log.containsKey(ac)){
			return log.get(ac);
		}
		return null;
	}
	public double getTotalIntrest(int year){
		double total=0;
		for(int i=0;i<intrestLog.size();i++){
			Transaction tmp=intrestLog.get(i);
			if(tmp.getType()=="intrest" && tmp.getYear()==year){
				total+=tmp.getAmount();
			}
		}
		return total;
	}
	
	public  double getTotalDeposits(int year){
		double total=0;
		
		Transaction tmp=new Transaction();
		for(int i=0;i<tmp.tdetails.size();i++){
			Transaction tmp1=tmp.tdetails.get(i);
			if(tmp.getType()=="debit" && tmp.getYear()==year){
				total+=tmp.getAmount();
			}
		}
		return total;
	 }
	
	public double getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
