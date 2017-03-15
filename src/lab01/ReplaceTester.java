package lab01;

import java.io.PrintStream;
import java.util.Scanner;

public class ReplaceTester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	PrintStream stdout=System.out;

	stdout.println("Enter a String");
	
	String str=sc.next();
	stdout.println("String Before replacement:"
			+ str);
	str=str.toLowerCase().replace('i','!');
	str=str.toLowerCase().replace('s','$');
	stdout.println("String after replacement:"
			+ str);
}
}
