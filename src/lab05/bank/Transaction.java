package lab05.bank;

import java.util.Calendar;
import java.util.Date;

public class Transaction {
	private static int transactionId = 1000;
    private Calendar date = Calendar.getInstance();
    private String narration;
    private String type;
    private double amount;
    public Transaction(Date date,String narration,String type,double amount){
        transactionId++;
        this.date.setTime(date);
        this.narration = narration;
        this.type = type;
        this.amount = amount;
    }
    public Date getDate(){
        return this.date.getTime();
    }
    public int getYear(){
        return this.date.get(Calendar.YEAR);
    }
    public String getType(){
        return this.type;
    }
    public String getNarration(){
        return this.narration;
    }
    public double getAmount(){
        return this.amount;
    }
    public double getAmount(int year){
        int y = date.get(Calendar.YEAR);
        double am =0;
        if(y==year)
            am = amount;
        return am;
    }
}
