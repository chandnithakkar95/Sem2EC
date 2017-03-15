package book;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lab07.DBConnection;
import lab07.DAOException;

public class BookDAOImplSQL implements BookDAO {

    public BookDAOImplSQL() 
            throws ClassNotFoundException, SQLException {
        con = DBConnection.getInstance().getConnection();        
    }
    
    @Override
    public boolean delete(String isbn) throws DAOException {
        String sql = "DELETE FROM books WHERE isbn = '" + isbn + "'; ";
        int n=0;
        try {
            Statement stmt = con.createStatement();
            n = stmt.executeUpdate( sql );
        }
        catch(SQLException e) {
        	throw new DAOException(e.getMessage());
        }
        return n > 0;
    }

    @Override
    public Book findByID(String isbn) throws DAOException {
        Book b = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE isbn ='" + isbn + "'");
            if ( rs.next() ) {
                b = new Book();
                b.setIsbn( isbn );
                b.setTitle(rs.getString("title"));
                b.setPrice(rs.getDouble("price"));
                b.setStock(rs.getInt("stock"));            
            }
        }
        catch(SQLException e) {
            throw new DAOException(e.getMessage());
        }
        return b;
    }

    @Override
    public ArrayList<Book> getAll() throws DAOException {
        ArrayList<Book> book_list = new ArrayList<>();
        Book b;
        Statement stmt;
        try {
            stmt = con.createStatement();        
            ResultSet rs = stmt.executeQuery("SELECT * FROM BOOKS");
            while ( rs.next() ) {
                b = new Book();
                b.setIsbn( rs.getString("isbn") );
                b.setTitle(rs.getString("title"));
                b.setPrice(rs.getDouble("price"));
                b.setStock(rs.getInt("stock"));            
                book_list.add( b );
            }        
        }
        catch(SQLException e) {
            throw new DAOException(e.getMessage());
        }
        
        return book_list;

    }

    @Override
    public ArrayList<Book> getAllPaginated(int page) throws DAOException {
        ArrayList<Book> book_list = new ArrayList<>();
        Book b;
        Statement stmt;
        try {
            stmt = con.createStatement();        
            //use offset and limit to return required page
            int offset = (page-1)*page_size;
            String sql = "SELECT * FROM BOOKS limit " + page_size + " offset " + offset;
            ResultSet rs = stmt.executeQuery( sql );
            while ( rs.next() ) {
                b = new Book();
                b.setIsbn( rs.getString("isbn") );
                b.setTitle(rs.getString("title"));
                b.setPrice(rs.getDouble("price"));
                b.setStock(rs.getInt("stock"));            
                book_list.add( b );
            }        
        }
        catch(SQLException e) {
            throw new DAOException(e.getMessage());
        }
        
        return book_list;

    }

    @Override
    public boolean update(Book bk) throws DAOException {
        //pre-condition: isbn exists
        int n=0;
        try {
            Statement stmt = con.createStatement();
            String sql;
            sql = "UPDATE books set " +
                "title = '" +  bk.getTitle() + "', " +
                "price = " + bk.getPrice() + ", " +
                "stock = " + bk.getStock() + 
                " WHERE isbn = '" + bk.getIsbn() + "'; ";
            n = stmt.executeUpdate( sql );
        }
        catch(SQLException e) {
            throw new DAOException(e.getMessage());
        }
        return n > 0;
    }
    
    @Override
    public boolean insert(Book b) throws DAOException {
        int n=0;
        try {
            Statement stmt = con.createStatement();
            String sql;
            sql = "INSERT INTO books (isbn, title, price, stock) VALUES(" +
                "'" + b.getIsbn() + "', " +
                "'" + b.getTitle() + "', " +
                b.getPrice() + ", " +
                b.getStock() + "); ";
            n = stmt.executeUpdate( sql );
        }
        catch(SQLException e) {
            throw new DAOException(e.getMessage());
        }

        return n > 0;
        
    }
    
    private final Connection con;
    private final int page_size = 3;
    
}
