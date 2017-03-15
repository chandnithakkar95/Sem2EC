<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList, pmj.bookstore.model.Book, pmj.bookstore.model.BookStore" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css">
        <title>Books in Stock</title>
    </head>
    <body>
        <h3>Books in Stock</h3>
        <a href="<%= application.getContextPath() %>/book_entry.jsp"> Add New Book </a>
        <table class="gridtable">
            <tr><th>ISBN</th><th>Title</th><th>Price</th><th>Stock</th><th></th><th></th></tr>
        <%
            BookStore store = (BookStore) application.getAttribute("store");
            ArrayList<Book> stock = store.getStock();
            if (stock == null ) { 
                out.println("<tr><td colspan=\"4\">No Books Found</td></tr>");
            } else {
                for(Book b : stock) { 
                    String isbn = b.getIsbn();
            %>
            <tr>
                <td><a href="<%= application.getContextPath() %>/book_show.jsp?isbn=<%= isbn %>"><%= isbn %></a></td>
                <td><%= b.getTitle() %></td>
                <td><%= b.getPrice() %></td>
                <td><%= b.getStock() %></td>
                <td><a href="<%= application.getContextPath() %>/book_entry.jsp?isbn=<%= isbn %>">Edit</a></td>
                <td><a href="#">Remove</a></td>
            </tr>                
            <%}
          }
        %>
        </table>
    </body>
</html>
