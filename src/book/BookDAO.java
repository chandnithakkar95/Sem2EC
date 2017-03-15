package book;

import java.util.ArrayList;
import lab07.DAOException;

public interface BookDAO {

   public boolean insert(Book bk) throws DAOException;
   public boolean update(Book bk) throws DAOException;
   public Book findByID(String id) throws DAOException;
   public boolean delete(String isbn) throws DAOException;
   public ArrayList<Book> getAll() throws DAOException;
   public ArrayList<Book> getAllPaginated(int page) throws DAOException;
   
    
}
