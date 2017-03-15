package book;

public class Book {

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
