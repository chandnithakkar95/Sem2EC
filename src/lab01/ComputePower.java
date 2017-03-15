package lab01;
import java.io.PrintStream;
import java.util.Scanner;


public class ComputePower {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		PrintStream stdout=System.out;
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		double ans=x;
		for(int i=0;i<(int)y-1;i++){
			ans*=x;
			
		}
		stdout.println(ans);
	}
}
