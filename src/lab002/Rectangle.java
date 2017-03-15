package lab002;
public class Rectangle {
public Rectangle() {
this.width = 20;
this.height = 10;
}
public Rectangle(double w, double h) {
this.width = w;
this.height = h;
}
public double getWidth(){
return this.width;
}
public double getHeight() {
return this.height;
}
public double perimeter() {
return 2*(this.width+this.height);
}
public double area() {
return this.width*this.height;
}
public void resize(double w, double h) {
this.width = w;
this.height = h;
}
public String getString() {
String str = String.format("\n\tWidth: %6.2f\n"
+ "\tHeight: %6.2f\n"
+ "\tPerimeter: %6.2f\n"
+ "\tArea: %6.2f\n", width, height, perimeter(), area());
return str;
}
private double width;
private double height;
}