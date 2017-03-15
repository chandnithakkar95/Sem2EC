package pmj.bookstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private DBConnection() 
            throws ClassNotFoundException, SQLException {
        Class.forName( DB_Driver );
        //DriverManager.registerDriver( new org.sqlite.JDBC() );
        con = DriverManager.getConnection(DB_URL, DB_User, DB_Pwd);
    }
      
    public static DBConnection getInstance() 
            throws ClassNotFoundException, SQLException {
        if (instance == null )
            instance = new DBConnection();
        return instance;
    }
    
    public Connection getConnection() {        
        return con;
    }

    public void close() throws SQLException{
        con.close();
        instance = null;
    }

    private final String DB_URL = "jdbc:sqlite:e:\\books.db";
    //private final String DB_URL = "jdbc:sqlite:books.db";
    private final String DB_User = "";
    private final String DB_Pwd = "";
    private final String DB_Driver = "org.sqlite.JDBC";

    private final Connection con;
    private static DBConnection instance = null;
    
}