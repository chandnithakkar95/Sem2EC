package lab01;

import java.io.PrintStream;
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintStream stdout=System.out;
		 stdout.print("Enter the Principal amount : "); 
	      double principal = sc.nextDouble();

	      stdout.print("Enter the Rate : "); 
	      double rate = sc.nextDouble();

	      stdout.print("Enter the Time : "); 
	      double time = sc.nextDouble();

	      double compoundInterest = principal * Math.pow((1 + rate/100),time); 
	  
	     stdout.println("");
	      stdout.println("The Compound Interest is : "
	     + compoundInterest);
	}
}
