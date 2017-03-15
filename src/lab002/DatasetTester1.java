package lab002;
import java.io.PrintStream;
import java.util.Scanner;

public class DatasetTester1 {
	public static void main(String[] args) {
		PrintStream out =System.out; 
		Scanner in = new Scanner(System.in);
		DataSet data = new DataSet();
		boolean done = false;
		while (!done) {
			out.print("Enter value, Q to quit: ");
			String input = in.next();
			if (input.equalsIgnoreCase("Q"))
				done = true;
			else {
				double x = Double.parseDouble(input);
				data.add(x);
			}
		}
		out.println("Average = " + data.getAverage());
		out.println("Maximum = " + data.getMaximum());
	}
}