package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.controller.Action;
import pmj.bookstore.dao.BookDAOImpl;
import pmj.bookstore.model.Book;

public class ShowBook implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        String view = null;
        
        String isbn = req.getParameter("isbn");
        String theAction = req.getParameter("action");
        
        if ( theAction.equals("edit") )
            view = "book_edit.jsp";
        else
            view = "book_show.jsp";
        
        Book book = null;
        
        try {
            BookDAOImpl book_db = new BookDAOImpl();
            book = book_db.findByID(isbn);
        }
        catch(Exception e) {
            req.setAttribute("error", e);
            return "error.jsp";
        }
        
        req.setAttribute("book", book);

        return view;

    }
    
}
