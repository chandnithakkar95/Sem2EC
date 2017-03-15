<%@page contentType="text/html" pageEncoding="UTF-8" import="pmj.bookstore.model.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book-Edit</title>
    </head>
    <body>
    <h1>Books Edit</h1>
    <form method = "post" action="Controller">
        <%@include file="book_show.jsp" %>
    <% if (book != null) { %>
        <input type="submit" value="Update" />
        <%}%>
        <input type="hidden" name="action" value="update" />
    </form>
    </body>
</html>
