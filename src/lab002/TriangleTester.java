package lab002;


public class TriangleTester {
	public static void main(String[] args) {
		Triangle1 t1 = new Triangle1();
		Triangle1 t2 = null;
		Triangle1 t3 = new Triangle1();
		t2 = new Triangle1(3, 4, 5);
		t3.resize(10, 30, 40);
		//test area and perimeter
		System.out.println("Area of t1: " + t1.area());
		System.out.println("Perimeter of t1: " + t1.perimeter());
		System.out.println("Area of t2: " + t2.area());
		System.out.println("Perimeter of t2: " + t2.perimeter());
		System.out.println("Area of t3: " + t3.area());
		System.out.println("Perimeter of t3: " + t3.perimeter());
	}
}