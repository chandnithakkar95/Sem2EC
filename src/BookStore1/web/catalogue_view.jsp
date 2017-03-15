<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList, pmj.bookstore.model.Book" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css">
        <title>Books in Stock</title>
    </head>
    <body>
        <h3>Books in Stock</h3>
        <a href="<%= application.getContextPath() %>/Controller?action=add"> Add New Book </a>
        <table class="gridtable">
            <tr><th>ISBN</th><th>Title</th><th>Price</th><th>Stock</th><th></th><th></th></tr>
        <%
            ArrayList<Book> stock = (ArrayList<Book>) request.getAttribute("stock");
            if (stock == null ) { 
                out.println("<tr><td colspan=\"4\">No Books Found</td></tr>");
            } else {
                for(Book b : stock) { 
                    String isbn = b.getIsbn();
            %>
            <tr>
                <td><a href="<%= application.getContextPath() %>/Controller?action=showbook&isbn=<%= isbn %>"><%= isbn %></a></td>
                <td><%= b.getTitle() %></td>
                <td><%= b.getPrice() %></td>
                <td><%= b.getStock() %></td>
                <td><a href="<%= application.getContextPath() %>/Controller?action=editbook&isbn=<%= isbn %>">Edit</a></td>
                <td><a href="#">Remove</a></td>
            </tr>                
            <%}
          }
        %>
        </table>
    </body>
</html>
