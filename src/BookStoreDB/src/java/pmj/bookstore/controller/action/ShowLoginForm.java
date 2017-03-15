package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pmj.bookstore.controller.Action;

public class ShowLoginForm implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        String view = "login.jsp";

        return view;

    }
    
}
