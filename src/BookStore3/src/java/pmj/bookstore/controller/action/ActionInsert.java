package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class ActionInsert  implements Action {

    @Override
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
            String isbn = request.getParameter("isbn");
            String title = request.getParameter("title");
            double price = Double.parseDouble(request.getParameter("price"));

            BookStore store = (BookStore) request.getServletContext().getAttribute("store");
            Book book = new Book(isbn, title, price, 1);
            store.addNewBook(book);

            ArrayList<Book> stock = store.getStock();
            request.setAttribute("stock", stock);
            return "catalogue_view.jsp";        
    }
    
    
}
