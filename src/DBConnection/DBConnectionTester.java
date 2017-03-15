package pjava.ch10.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionTester {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getInstance().getConnectionSchema("company");
            Statement stmt = con.createStatement();
            String str_sql = "SELECT * FROM Employee AS e JOIN Employee AS s ON (e.superssn=s.ssn) WHERE e.dno=4";
            //String str_sql = "SELECT * FROM company.Employee WHERE dno=4";
            ResultSet rs = stmt.executeQuery( str_sql );
            while ( rs.next() ) {
                String fname, ss, sname="";
                fname = rs.getString("fname");
                ss = rs.getString("superssn");
                //sname = rs.getString("fname");
                if ( ss == null )
                    ss = "Null";
                System.out.println( fname +" " +  ss + " " + sname);
            }
        }
        catch (SQLException e) {
            System.out.println("Error Executing SQL statement: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}