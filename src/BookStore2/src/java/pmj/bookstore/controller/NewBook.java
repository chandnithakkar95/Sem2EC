package pmj.bookstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewBook {

    public String perform(HttpServletRequest request,
            HttpServletResponse response) {
            request.setAttribute("book", null);
            request.setAttribute("update_action", "insert");            
            return "book_entry.jsp";
    }
}
