package pmj.bookstore.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theAction = request.getParameter("action");
        String view = "index.jsp";

        if ( theAction == null)
            theAction = "viewcat";
        
        if (theAction.equalsIgnoreCase("viewcat")) {
            ArrayList<Book> stock = store.getStock();
            request.setAttribute("stock", stock);
            view = "catalogue_view.jsp";
        }
        else if (theAction.equalsIgnoreCase("newbook")) {
            request.setAttribute("book", null);
            request.setAttribute("update_action", "insert");            
            view = "book_entry.jsp";
        }
        else if (theAction.equalsIgnoreCase("editbook")) {
            String isbn = request.getParameter("isbn");
            Book book = store.getBook(isbn);
            request.setAttribute("book", book);
            request.setAttribute("update_action", "update");            
            view = "book_entry.jsp";
        }
        else if (theAction.equalsIgnoreCase("showbook")) {
            String isbn = request.getParameter("isbn");
            Book book = store.getBook(isbn);
            request.setAttribute("book", book);
            view = "book_show.jsp";
        }
        else if (theAction.equalsIgnoreCase("insert")) {
            String isbn = request.getParameter("isbn");
            String title = request.getParameter("title");
            double price = Double.parseDouble(request.getParameter("price"));

            Book book = new Book(isbn, title, price, 1);
            store.addNewBook(book);

            ArrayList<Book> stock = store.getStock();
            request.setAttribute("stock", stock);
            view = "catalogue_view.jsp";
        }
        else if (theAction.equalsIgnoreCase("update")) {
            String isbn = request.getParameter("isbn");
            String title = request.getParameter("title");
            double price = Double.parseDouble(request.getParameter("price"));

            Book book = store.getBook(isbn);
            
            if ( book == null ) {
                book = new Book(isbn, title, price, 1);
                store.addNewBook(book);
            }
            else {
                    book.setIsbn( isbn );
                    book.setTitle( title );
                    book.setPrice( price );
            }
            ArrayList<Book> stock = store.getStock();
            request.setAttribute("stock", stock);
            view = "catalogue_view.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(view);
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

    BookStore store = new BookStore();

}

/*
        if (theAction.equalsIgnoreCase("viewbook")) {
            String isbn = request.getParameter("isbn");
            Book book = store.getBook(isbn);
            request.setAttribute("book", book);
            view = "book_show.jsp";
        }
*/
