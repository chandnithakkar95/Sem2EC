package pmj.bookstore.model;

import java.util.ArrayList;

public class BookStore {
    
    public BookStore() {
        stock = new ArrayList<Book>();
        stock.add( new Book("1001", "Database Systems", 450, 10 ));
        stock.add( new Book("1002", "Object Oriented Design and Patterns", 339,8) );
        stock.add( new Book("1003", "Core J2EE™ Patterns", 2250,2) );
    }   
    
    public void addNewBook(Book book) {
        stock.add( book );
    }

    public void addStock(String isbn, int no) {}

    public ArrayList<Book> getStock() {
        return stock;
    }

    public Book getBook(String isbn) {
        for(Book b : stock) {
            if ( b.getIsbn().equals(isbn) )
                return b;
        }
        return null;
    }
    
    public void updateBook(Book book) {
    }
    
    public void depleteStock(String isbn, int no) {
    }    

    private final ArrayList<Book> stock;

}
