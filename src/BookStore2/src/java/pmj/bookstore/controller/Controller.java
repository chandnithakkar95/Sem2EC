package pmj.bookstore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import pmj.bookstore.model.BookStore;

public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theAction = request.getParameter("action");
        String view = "index.jsp";

        if ( theAction == null)
            theAction = "viewcat";
        
        if (theAction.equalsIgnoreCase("viewcat")) {
            ViewCat delegate = new ViewCat();
            view = delegate.perform(request, response);
        }
        else if (theAction.equalsIgnoreCase("newbook")) {
            NewBook delegate = new NewBook();
            view = delegate.perform(request, response);
        }
        else if (theAction.equalsIgnoreCase("showbook")) {
            ShowBook delegate = new ShowBook();
            view = delegate.perform(request, response);
        }
        else if (theAction.equalsIgnoreCase("editbook")) {
            EditBook delegate = new EditBook();
            view = delegate.perform(request, response);
        }
        else if (theAction.equalsIgnoreCase("insert")) {
            Insert delegate = new Insert();
            view = delegate.perform(request, response);
        }
        else if (theAction.equalsIgnoreCase("update")) {
            Update delegate = new Update();
            view = delegate.perform(request, response);
        }
        //Action Performed and target view is available
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);    
    } 
    
    @Override
    public void init() throws ServletException {
        super.init(); 
        BookStore store = new BookStore();
        getServletContext().setAttribute("store", store);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
}