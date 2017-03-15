package pmj.bookstore.controller.action;

import pmj.bookstore.controller.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Error implements Action {
    
    public Error(Exception e) {
        exp = e;
    }
    
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        req.setAttribute("error", exp.toString() );
        return "error.jsp";
    }

    private Exception exp;
    
}
