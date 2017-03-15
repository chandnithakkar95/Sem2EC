<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList, pmj.bookstore.model.Book, pmj.bookstore.model.BookStore" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store</title>
    </head>
    <jsp:forward page="catalogue_view.jsp" />
        <!--%
            //response.sendRedirect( application.getContextPath() + "/catalogue_view.jsp");
        %-->
    <%! 
	public void jspInit() {
            BookStore store = new BookStore();
            this.getServletContext().setAttribute("store", store);
	}
        public void jspDestroy() {
            this.getServletContext().setAttribute("store", null);
	}
    %>
</html>
