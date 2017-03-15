package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.dao.BookDAOImpl;

public class RemoveBook extends ActionBook {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {

        String view = "catalogue_view.jsp";
               
        String isbn = req.getParameter("isbn");

        try {
            BookDAOImpl book_db = new BookDAOImpl();
            book_db.delete(isbn);
            putStockRequest(req, resp);
        }
        catch(Exception e) {
            req.setAttribute("error", e.toString() + "[RemoveBook.java]");
            return "error.jsp";
        }

        return view;
        
    }
    
}
