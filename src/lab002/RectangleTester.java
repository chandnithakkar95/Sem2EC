package lab002;

import java.io.PrintStream;

public class RectangleTester {
	public static void main(String[] args) {
		PrintStream out=System.out;
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(100,200);
		out.println("r1: " + r1.toString());
		out.println("r2: " + r2);
		r2.resize(300,500);
		out.println("r2: " + r2);
		//rename name of toString method to getString() and then run following code
		out.println("r1: " + r1.getString());
		out.println("r2: " + r2.getString());
	}
}
