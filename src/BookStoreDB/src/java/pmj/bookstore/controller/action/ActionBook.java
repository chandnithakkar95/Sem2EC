package pmj.bookstore.controller.action;

import java.util.ArrayList;
import pmj.bookstore.model.Book;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.controller.Action;
import pmj.bookstore.dao.BookDAOImpl;

public abstract class ActionBook implements Action {

    protected Book getBookObjectRequest(HttpServletRequest req, HttpServletResponse resp){
        
        String isbn = req.getParameter("isbn");
        String title = req.getParameter("title");
        double price = Double.parseDouble(req.getParameter("price"));
        int qty = Integer.parseInt(req.getParameter("qty"));
        
        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setPrice(price);
        book.setStock(qty);
        
        return book;

    }

    protected void putStockRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        BookDAOImpl book_db = new BookDAOImpl();
        ArrayList<Book> stock = book_db.getAll();
        req.setAttribute("stock", stock);
    }
    
}
