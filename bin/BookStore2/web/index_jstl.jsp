<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList,pmj.bookstore.model.Book, pmj.bookstore.model.BookStore" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store</title>
    </head>
        <%
            BookStore store = (BookStore) request.getServletContext().getAttribute("store");
            ArrayList<Book> stock = store.getStock();
            request.setAttribute("stock", stock);
        %>
    <jsp:forward page="catalogue_view_jstl.jsp" />
</html>
