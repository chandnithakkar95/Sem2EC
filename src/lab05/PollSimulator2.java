package lab05;

import java.io.PrintStream;
import java.util.Scanner;
public class PollSimulator2{
	static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		PrintStream out=System.out;
		String[] candNames = new String[5];
		candNames[0] = "Deep Goyal";
		candNames[1] = "Sneha Mohan";
		candNames[2] = "Praveen Shah";
		candNames[3] = "Akshay Singh";
		candNames[4] = "Somin Majumdar";
		PollDB poll_db = new PollDB( candNames );
		int nc = poll_db.getNumberOfCandidates();
		out.println("Enter Number of voters");
		int numOfVoters=sc.nextInt();
		
		for( int i = 1; i <=numOfVoters; i++ ) {
			for(int j=1;j<=nc;j++){
			System.out.println(j+ ""+ poll_db.getCandidateName(j));
			}
			out.println("Enter Whom to vote");
			int vt=sc.nextInt();
			if(vt>5 || vt<0){
				System.out.println("select appropriate option revote pls ");
				i--;
				continue;
			}
			else{
			poll_db.voteTo(vt);
			}
		}
		
		
		int count=0;
		for(int i=0;i<3;i++){
			out.println("Enter Password to see result");
			String pswd=sc.next();	
			if(!pswd.equals(poll_db.getPassword())){
				out.println("Password is incorrect retype it");
				count++;
			}
			else{
				break;
			}
		}
		if(count>=3){
			out.println("Sorry You cant see the result");
			System.exit(1);
		}
		for(int i = 1;i <= poll_db.getNumberOfCandidates(); i++ ) {
			System.out.println(poll_db.getCandidateName(i)+ ": " + poll_db.votesCount(i));
		}
		System.out.println("Winner: " + poll_db.getWinner());
	}
}