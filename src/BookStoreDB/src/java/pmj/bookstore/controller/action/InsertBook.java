package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.model.Book;
import pmj.bookstore.dao.BookDAOImpl;

public class InsertBook extends ActionBook {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {

        String view = "catalogue_view.jsp";
      
        try {
            BookDAOImpl book_db = new BookDAOImpl();
            Book book = getBookObjectRequest(req, resp);
            book_db.insert(book);
            putStockRequest(req, resp);
        }
        catch(Exception e) {
            req.setAttribute("error", e.toString() + "[InsertBook.java]");
            return "error.jsp";
        }
        return view;
    }
    
}
