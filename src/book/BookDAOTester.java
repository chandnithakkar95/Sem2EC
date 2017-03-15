package book;

import java.util.ArrayList;
import lab07.DAOException;

public class BookDAOTester {

    public static void main(String[] args) throws Exception {
        
        System.out.println("DAO Tester runs ...");
        
        try {
            
            BookDAO book_db = new BookDAOImplSQL();

            Book b1 = book_db.findByID("1001");
            System.out.println( b1.getIsbn() + "," + b1.getTitle());
            
            Object x = book_db.getAll();
            ArrayList<Book> stock = (ArrayList<Book>) x;
            for(Book b : stock) {
                System.out.println( b.getIsbn() + "," + b.getTitle());
            }

            System.out.println("page: 2");
            x = book_db.getAllPaginated(1);
            stock = (ArrayList<Book>) x;
            for(Book b : stock) {
                System.out.println( b.getIsbn() + "," + b.getTitle());
            }
            
        }
        catch(DAOException e) {
            System.out.println("Error: " + e.getMessage() );
            throw e;
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage() );
            throw e;
        }
    }
    
    
}
