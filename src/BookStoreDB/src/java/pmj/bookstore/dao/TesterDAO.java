package pmj.bookstore.dao;

import pmj.bookstore.model.Book;
import java.util.ArrayList;

public class TesterDAO {

    public static void main(String[] args) {
        
        System.out.println("Staring DAO Tester");
        
        try {
            BookDAOImpl book_db = new BookDAOImpl();
            
            //Book b = book_db.findByID("1001");
            //System.out.println( b.getIsbn() + "," + b.getTitle());
            
            
            Object x = book_db.getAll();
            ArrayList<Book> stock = (ArrayList<Book>) x;
            for(Book b : stock) {
                System.out.println( b.getIsbn() + "," + b.getTitle());
            }
            
        }
        catch(Exception e) {
            System.out.println("exception-9" + e.getMessage() );
        }
        
    }
    
    
}
