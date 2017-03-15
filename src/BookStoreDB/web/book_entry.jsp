<%@page contentType="text/html" pageEncoding="UTF-8" import="pmj.bookstore.model.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book-Entry</title>
    </head>
    <body>
    <h1>Books Entry</h1>
    <% 
        Book bk = new Book(); 
        request.setAttribute("book", bk);
    %>
    <form method = "post" action="Controller">
        <%@include file="book_show.jsp" %>
        <input type="submit" value="Add" />
        <input type="hidden" name="action" value="insert" />
    </form>
    
    </body>
</html>

<!--
    <table>
        <tr><td>ISBN</td><td><input type="text" name ="isbn" value="" /></td></tr>
        <tr><td>Title</td><td><input type="text" name="title" value="" /></td></tr>
        <tr><td>Price</td><td><input type="text" name="price" value="" /></td></tr>
        <tr><td>Stock</td><td><input type="text" name="qty" value="" /></td></tr>
        <tr><td></td><td><input type="submit" value="Add" /></td></tr>
    </table>
-->