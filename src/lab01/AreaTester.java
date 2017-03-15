package lab01;

import java.awt.Rectangle;
import java.io.PrintStream;
import java.util.Scanner;

public class AreaTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintStream stdout=System.out;
		stdout.println("Enter x");
		int x=sc.nextInt();
		stdout.println("Enter y");
		int y=sc.nextInt();
		stdout.println("Enter width");
		int width=sc.nextInt();
		stdout.println("Enter height");
		int height=sc.nextInt();
		Rectangle rect=new Rectangle(x,y,width,height);
		double area = rect.getWidth()*rect.getHeight(); 
		
		stdout.print(area);
	}
}
