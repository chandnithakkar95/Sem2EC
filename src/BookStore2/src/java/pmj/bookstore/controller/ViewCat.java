package pmj.bookstore.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class ViewCat {

    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
        BookStore store = (BookStore) request.getServletContext().getAttribute("store");
        ArrayList<Book> stock = store.getStock();
        request.setAttribute("stock", stock);
        return "catalogue_view.jsp";        
    }
}
