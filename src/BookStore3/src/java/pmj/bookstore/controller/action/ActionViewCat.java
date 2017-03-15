package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class ActionViewCat  implements Action {

    @Override
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
        BookStore store = (BookStore) request.getServletContext().getAttribute("store");
        ArrayList<Book> stock = store.getStock();
        request.setAttribute("stock", stock);
        return "catalogue_view.jsp";        
    }
    
}
