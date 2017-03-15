<%@page contentType="text/html" pageEncoding="UTF-8" import="pmj.bookstore.model.Book"%>
    <table>
    <% 
        Book book = (Book) request.getAttribute("book");
        if (book == null) { %>
        <tr><td colspan="2">Record Not Found</td></tr>
        <%
        } else {
    %>
        <tr><td>ISBN</td><td><input type="text" name ="isbn" value="<%= book.getIsbn() %>" /></td></tr>
        <tr><td>Title</td><td><input type="text" name="title" value="<%= book.getTitle() %>" /></td></tr>
        <tr><td>Price</td><td><input type="text" name="price" value="<%= book.getPrice() %>" /></td></tr>
        <tr><td>Stock</td><td><input type="text" name="qty" value="<%= book.getStock() %>" /></td></tr>
        <%}%>
    </table>
