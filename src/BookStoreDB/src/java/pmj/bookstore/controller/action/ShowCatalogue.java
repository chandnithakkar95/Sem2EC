package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.controller.Action;
import pmj.bookstore.dao.BookDAOImpl;
import pmj.bookstore.dao.BookDAO;
import pmj.bookstore.model.Book;

import java.util.ArrayList;

public class ShowCatalogue implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        String view = "catalogue_view.jsp";
        
        try {
            BookDAO book_db = new BookDAOImpl();
            ArrayList<Book> stock = book_db.getAll();
            req.setAttribute("stock", stock);
        }
        catch(Exception e) {
            req.setAttribute("error", e.toString() + ";[ShowCat.java]");
            return "error.jsp";
        }

        return view;

    }
    
}
