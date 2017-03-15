package lab002;
public class CurveTester {
	public static void main(String[] args) {
		Point p = new Point(3,4);
		Curve c1 = new Curve(p);
		Point p1 = new Point(2,0);
		Point p2 = new Point(2,2);
		c1.addNext(p1);
		c1.addNext(p2);
		c1.addNext(new Point(0,2));
		c1.addNext(new Point(3,10));
		System.out.println( "c1:" + c1.toString() );
		System.out.println("After Removal : -");
		c1.popLast();
		System.out.println( "c1:" + c1.toString() );
		System.out.println("Last Point is : -");
		System.out.println( c1.lastPoint().toString() );
		System.out.println("Traversal disance is :" + c1.length());
	}
}