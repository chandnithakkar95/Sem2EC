	package lab03;
	
	
	
	import java.io.PrintStream;
	import java.util.Scanner;
	
	public class StackTriangleTester {
		static Scanner sc;
		public static void main(String[] args) {
			sc = new Scanner(System.in);
			PrintStream out=System.out;
			//	int sStack=sc.nextInt();
			Stack stk=new Stack();
			while(true){
				out.println("1 Push");
				out.println("2 Pop");
				out.println("3 peek");
				out.println("4 Exit");
				int ch=sc.nextInt();
				switch (ch) {
				case 1:
					double a,b,c;
					a=sc.nextDouble();
					b=sc.nextDouble();
					c=sc.nextDouble();
					Triangle t1=new Triangle(a, b, c);
					stk.push(t1);
					break;
				case 2:
					try{
					Object n=stk.pop();
					out.println("Element is Poped "+n);
					
					}
					catch(Exception e){
						e.printStackTrace();
					}
					break;
					
				case 3:
					Object n2=stk.peek();
					out.println("Top element"+n2);
				case 4:
					System.exit(1);
				}
			}
		}
	}
