package ExperimentProgs;

public class Exp1 {
	public static void main(String[] args) {
		String r1=new String("Chandni");
		String r2=new String("Chandni");
		System.out.println(r1==r2);
		r2=r1;
		System.out.println(r1==r2);
		System.out.println();
		System.out.println(r1.equals(r2));
	}
}
