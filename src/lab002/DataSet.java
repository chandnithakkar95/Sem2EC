package lab002;

public class DataSet {
	public DataSet() {
		this.sum = 0;
		this.count = 0;
		this.maximum = 0;
	}
	public void add(double x) {
		this.sum = this.sum + x;
		if (this.count == 0 || this.maximum < x) this.maximum = x;
		this.count++;
	}
	public double getAverage() {
		if (this.count == 0)
			return 0;
		else
			return this.sum / this.count;
	}
	public double getMaximum() {
		return this.maximum;
	}
	private double sum;
	private double maximum;
	private int count;
}