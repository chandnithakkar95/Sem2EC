package pmj.bookstore.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pmj.bookstore.model.Book;

public class BookDAOImpl implements BookDAO {

    public BookDAOImpl() 
            throws ClassNotFoundException, SQLException {
        con = DBConnection.getInstance().getConnection();        
    }
    
    @Override
    public boolean delete(String isbn) throws SQLException {
        Statement stmt = con.createStatement();
        String sql = "DELETE FROM books WHERE isbn = '" + isbn + "'; ";
        int n = stmt.executeUpdate( sql );
        return n > 0;
    }

    @Override
    public Book findByID(String isbn) throws SQLException {
        Book b = null;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE isbn ='" + isbn + "'");
        if ( rs.next() ) {
            b = new Book();
            b.setIsbn( isbn );
            b.setTitle(rs.getString("title"));
            b.setPrice(rs.getDouble("price"));
            b.setStock(rs.getInt("stock"));            
        }
        return b;
    }

    @Override
    public ArrayList<Book> getAll() throws SQLException {
        ArrayList<Book> book_list = new ArrayList<Book>();
        Book b;
        Statement stmt;
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
        
        return book_list;

    }

    @Override
    public boolean update(Book bk) throws SQLException {
        //pre-condition: isbn exists
        Statement stmt = con.createStatement();
        String sql = null;
        sql = "UPDATE books set " +
            "title = '" +  bk.getTitle() + "', " +
            "price = " + bk.getPrice() + ", " +
            "stock = " + bk.getStock() + 
            " WHERE isbn = '" + bk.getIsbn() + "'; ";
        int n = stmt.executeUpdate( sql );
        return n > 0;
    }
    
    @Override
    public boolean insert(Book b) throws SQLException {

        Statement stmt = con.createStatement();
        String sql;
        sql = "INSERT INTO books (isbn, title, price, stock) VALUES(" +
            "'" + b.getIsbn() + "', " +
            "'" + b.getTitle() + "', " +
            b.getPrice() + ", " +
            b.getStock() + "); ";
        int n = stmt.executeUpdate( sql );
        return n > 0;
        
    }
    
    private final Connection con;
    
}
