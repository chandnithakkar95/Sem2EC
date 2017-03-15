package pmj.bookstore.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginValidate extends ActionBook {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {

        String user = req.getServletContext().getInitParameter("user");
        String pwd = req.getServletContext().getInitParameter("password");        
        
        String user_in = req.getParameter("user");
        String pwd_in = req.getParameter("password");
        
        String view = null;
        if ( user_in.equals(user) && pwd_in.equals(pwd) ) {
            req.getSession().setAttribute("user", user_in);
            try {
                putStockRequest(req, resp);
            }
            catch (Exception e) {
                req.setAttribute("error", e.toString() + "[LoginValidate.java]");
                return "error.jsp";
            }
            view = "catalogue_view.jsp";
        }
        else {
            req.getSession().setAttribute("user", null);
            view = "login_failure.jsp";
        }

        return view;
        
    }
    
}
