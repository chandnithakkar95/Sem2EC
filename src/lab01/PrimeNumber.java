package lab01;

import java.io.PrintStream;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintStream stdout=System.out;
		int i,m=0;
		boolean flag=false;
		int n=sc.nextInt();
		m=n/2;
		for(i=2;i<=m;i++){    
			if(n%i==0){    
			stdout.println("Number is not prime");    
				flag=true;    
				break;    
			}
		}
		if(!flag){
			stdout.print("Number is Prime");
		}
		
	}
	
}
