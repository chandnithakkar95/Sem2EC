package lab002;
public class PointTester {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setXY(20,30);
		Point p2 = new Point(50,70);
		Point p3 = new Point();
		p3.setRTheta(3,Math.PI/6);
		System.out.println("r :" + p2.getRadius()
		+ " theta :" + p2.getTheta());
		System.out.println( p1.toString() );
		//you can also write System.out.println( p1 );
		System.out.println( p2.toStringPolar() );
		System.out.println("The required Distance is :" + Point.distance(p1,p2));
	}
}