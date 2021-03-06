package pmj.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.model.BookStore;
import pmj.bookstore.model.Book;

public class ShowBook {
    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
            String isbn = request.getParameter("isbn");
            BookStore store = (BookStore) request.getServletContext().getAttribute("store");
            Book book = store.getBook(isbn);
            request.setAttribute("book", book);
            return "book_show.jsp";
    }
}
