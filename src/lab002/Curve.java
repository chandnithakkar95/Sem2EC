package lab002;
import java.util.ArrayList;
public class Curve {
	private final ArrayList<Point> segments = new ArrayList<>();
	public Curve() {
		segments.add(new Point(0,0));
	}
	public Curve(Point p) {
		segments.add(p);
	}
	public void addNext(Point p) {
		segments.add(p);
	}
	public Point popLast() {
		int len = segments.size();
		Point p = segments.get(len-1);
		segments.remove(len-1);
		return p;
	}
	public Point lastPoint() {
		int len = segments.size();
		Point p = segments.get(len-1);
		return p;
	}
	public double length() {
		int count = segments.size();
		double len = 0;
		for(int c = 0; c < count-1; c++) {
			len += segments.get(c).distance(segments.get(c+1));
		}
		return len;
	}
	@Override
	public String toString() {
		String str = "";
		int count = segments.size();
		for(int c = 0; c <= count-1; c++)
			str += segments.get(c).toString();
		return str;
	}
}