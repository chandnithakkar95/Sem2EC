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
        <%
            //String msg = (String) request.getAttribute("message");
            //if ( msg != null )
                //out.println( "msg: " + msg);
            
        %>
        <a href="<%= application.getContextPath() %>/Controller?action=newbook"> Add New Book </a>
        <table class="gridtable">
            <tr><th>ISBN</th><th>Title</th><th>Price</th><th>Stock</th></tr>
        <%
            ArrayList<Book> stock = (ArrayList<Book>) request.getAttribute("stock");
            if (stock == null ) { 
                out.println("<tr><td colspan=\"4\">Null Stock</td></tr>");
            } else {
                for(Book b : stock) { 
                    String isbn = b.getIsbn();
            %>
            <tr>
                <td><a href="/BookStoreDB/Controller?action=viewbook&isbn=<%= isbn %>"><%= isbn %></a></td>
                <td><%= b.getTitle() %></td>
                <td><%= b.getPrice() %></td>
                <td><%= b.getStock() %></td>
            </tr>                
            <%}
          }
        %>
        </table>
    </body>
</html>
