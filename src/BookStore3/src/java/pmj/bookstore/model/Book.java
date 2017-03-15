package pmj.bookstore.model;

public class Book {

    public Book() {
        this("","",0,0);
    }
    public Book(String isbn, String title, double price, int qty) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.qty = qty;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return qty;
    }

    public void setStock(int qty) {
        this.qty = qty;
    }
    
    private String isbn = "";
    private String title = "";
    private double price = 0;
    private int qty = 0;

}
