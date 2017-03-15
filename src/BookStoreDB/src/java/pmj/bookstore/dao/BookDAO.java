package pmj.bookstore.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import pmj.bookstore.model.Book;

public interface BookDAO {

   public boolean insert(Book bk) throws SQLException;
   public boolean update(Book bk) throws SQLException;
   public Book findByID(String id) throws SQLException;
   public boolean delete(String isbn) throws SQLException;
   public ArrayList<Book> getAll() throws SQLException;
    
}
