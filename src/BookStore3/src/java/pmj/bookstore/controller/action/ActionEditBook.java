package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class ActionEditBook implements Action {

    @Override
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
            String isbn = request.getParameter("isbn");
            BookStore store = (BookStore) request.getServletContext().getAttribute("store");
            Book book = store.getBook(isbn);
            request.setAttribute("book", book);
            request.setAttribute("update_action", "update");            
            return "book_entry.jsp";
    }
}
