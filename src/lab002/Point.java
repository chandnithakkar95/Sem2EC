package lab002;

public class Point {
public Point() {
x_cor = 0;
y_cor = 0;
}
public Point(double x, double y) {
x_cor = x;
y_cor = y;
}
public void setXY(double x, double y ) {
x_cor = x;
y_cor = y;
}
public double getX() {
return x_cor;
}
public double getY() {
return y_cor;
}
public double distance(Point p) {
double x1 = this.getX();
double y1 = this.getY();
double x2 = p.getX();
double y2 = p.getY();
double fac1 = Math.pow(x2-x1,2);
double fac2 = Math.pow(y2-y1,2);
return (Math.sqrt(fac1+fac2));
}
public static double distance(Point p1, Point p2) {
double x1 = p1.getX();
double y1 = p1.getY();
double x2 = p2.getX();
double y2 = p2.getY();
double fac1 = Math.pow(x2-x1,2);
double fac2 = Math.pow(y2-y1,2);
return (Math.sqrt(fac1+fac2));
}
public void setRTheta(double r, double theta) {
x_cor = r * Math.cos(theta);
y_cor = r * Math.sin(theta);
}
public double getRadius() {
return Math.sqrt(x_cor*x_cor + y_cor*y_cor);
}
public double getTheta() {
return Math.atan(y_cor/x_cor) * 180 / Math.PI;
}
@Override
public String toString() {
String str = "(x: " + x_cor + ",y: " + y_cor + ")";
return str;
}
public String toStringPolar() {
String str = "(r: " + this.getRadius()
+ ",y: " + this.getTheta() + ")";
return str;
}
private double x_cor;
private double y_cor;
}