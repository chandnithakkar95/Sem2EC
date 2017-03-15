package pmj.bookstore;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class UpdateServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theAction = request.getParameter("action");
        
        String isbn = request.getParameter("isbn");
        String title = request.getParameter("title");
        double price = Double.parseDouble(request.getParameter("price"));
        BookStore store = (BookStore) this.getServletContext().getAttribute("store");
        Book book;
        if (theAction.equalsIgnoreCase("insert") )
            book = new Book(isbn, title, price, 1);
        else
            book = store.getBook(isbn);            
        if ( book == null ) {
            book = new Book(isbn, title, price, 1);
            theAction = "insert";
        }
        if (theAction.equalsIgnoreCase("insert") )
            store.addNewBook(book);
        else {
                book.setIsbn( isbn );
                book.setTitle( title );
                book.setPrice( price );
        }
        RequestDispatcher rd = 
                request.getRequestDispatcher("catalogue_view.jsp");
        rd.forward(request, response);    
        
    } 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}