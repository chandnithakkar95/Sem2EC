<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList, pmj.bookstore.model.Book" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css">
        <title>Books in Stock</title>
    </head>
    <body>
        <h1>Books in Stock</h1>
        <table class="gridtable">
            <tr><th>ISBN</th><th>Title</th><th>Price</th><th>Stock</th></tr>
        <%
            ArrayList<Book> stock = (ArrayList<Book>) request.getAttribute("stock");
            for(Book b : stock) { %>
           
            <tr>
                <td><a href="#"><%= b.getIsbn() %></a></td>
                <td><%= b.getTitle() %></td>
                <td><%= b.getPrice() %></td>
                <td><%= b.getStock() %></td>
            </tr>                
            <%}
        %>
        </table>
    </body>
</html>
