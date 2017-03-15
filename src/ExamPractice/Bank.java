package ExamPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import lab04.InventoryItem;
import lab04.ItemNotFound;

public class Bank{


	private ArrayList<AccountHolder> acHolder;
	public Bank(){ 
		acHolder=new ArrayList<AccountHolder>();
	}
	public void addAccountHolder(AccountHolder new_accountHolder){
		acHolder.add(new_accountHolder);
	}

	public void depositeAmount(int AccountNumber,double amount)throws NoAccountFound, DepositeLimitExcced{ 

		//deposite money according to the account type if saving account then limit 50,000 else no limit
		if(amount<50000){
			AccountHolder tmp= search(AccountNumber);
			tmp.deposite(amount);
		}else
		throw new DepositeLimitExcced("Limit is only 50000 U cant deposite above 50000 ");
	}


	public void withdrawnAmount(int AccountNumber,double amount)throws NoAccountFound, InSufficientBalance ,WithdrawnLimitExceed{ 
		//withdrawn amount according to the account type;
		//if account type is saving then don't allow withdrawn money less than min amount
		AccountHolder tmp=search(AccountNumber);
		if(tmp.getAccountType()!="saving"){
			tmp.withdrawn(amount);
		}
		else if(tmp.getAccountType()=="saving" && amount > tmp.getMinBalance()){
			throw new WithdrawnLimitExceed("U can withdraw upto: "+(tmp.getAvailableBalance()-tmp.getMinBalance()));
		}
		else{
			tmp.withdrawn(amount);
		}
	}

	private AccountHolder search(int AccountNumber) throws NoAccountFound{
		Iterator<AccountHolder> itr=new Iterator<AccountHolder>() {
			int i=0;
			@Override
			public AccountHolder next() {
				// TODO Auto-generated method stub
				if(hasNext()){
					return acHolder.get(i++);
				}
				else{
					throw new NoSuchElementException("No Element");
				}
			
			}
			
			@Override
			public boolean hasNext() {
				return (i<acHolder.size())?true:false;
			}
		};
		while(itr.hasNext()){
			AccountHolder a = itr.next();
			if(a.getAccountNumber() == AccountNumber)
			{
				return a;
			}
		}
	//	for(AccountHolder accountHolder:acHolder){
		//	if(accountHolder.getAccountNumber()==AccountNumber){
			//	return accountHolder;
			//}
		//}
		throw new NoAccountFound("Sorry not Found");
	}

	public AccountHolder[] AccountUnderMinBalance(){
		ArrayList<AccountHolder> acHold=new ArrayList<AccountHolder>();
		for(AccountHolder accountHolder:acHolder){
			if(accountHolder.isMinBalance()){
				acHold.add(accountHolder);
			}
		}
		AccountHolder[] tmp=new AccountHolder[0];
		tmp=acHold.toArray(tmp);
		return tmp;
	}

	public double CheckBalance(int AccountNumber) throws NoAccountFound {
		AccountHolder tmp=search(AccountNumber);
		return tmp.getAvailableBalance();
	}

	public double calInterest(int AccountNumber)throws NoAccountFound
	{
		AccountHolder tmp=search(AccountNumber);
		return tmp.getAvailableBalance();
	}


}