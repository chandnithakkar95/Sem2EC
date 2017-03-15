package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.dao.BookDAOImpl;
import pmj.bookstore.model.Book;

public class UpdateBook extends ActionBook {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {

        String view = "catalogue_view.jsp";
        
        Book book = getBookObjectRequest(req, resp);
        
        try {
            BookDAOImpl book_db = new BookDAOImpl();
            book_db.update(book);
            putStockRequest(req, resp);
        }
        catch(Exception e) {
            req.setAttribute("error", e.toString() + "[UpdateBook.java]");
            return "error.jsp";
        }

        return view;
        
    }
    
}
