package lab03;


public class Book {
	String title;
	double price;
	int ISBN;
	Book(int ISBN, String title, double price) {
		this.ISBN=ISBN;
		this.price=price;
		this.title=title;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String new_title) {
		this.title = new_title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double new_price) {
		this.price = new_price;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int new_isbn) {
		ISBN = new_isbn;
	}
	public String toString(){
		return "ISBN :"+ISBN +"\n "+"Name :"+title +"\n "+ "Price :"+price;
	}
}