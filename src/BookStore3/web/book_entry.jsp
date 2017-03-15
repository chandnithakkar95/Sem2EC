<%@page contentType="text/html" pageEncoding="UTF-8" import="pmj.bookstore.model.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book-Entry</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    <body>
    <% 
        String update_action = (String) request.getAttribute("update_action");
        Book book;
	String heading = "";
	String caption = "";
        if ( update_action.equalsIgnoreCase("insert")) {
            book = new Book();
            heading = "New Book";
            caption = "Add Book";
	}
        else {
            book = (Book) request.getAttribute("book");
            heading = "Book - Edit";
            caption = "Update";
	}
    %>
    <h2><%= heading %></h2>
    <form method = "post" action="Controller">
    <input type="hidden" name="action" value="<%= update_action %>" />
    <table class="gridtable">
        <tr><td>ISBN</td><td><input type="text" name="isbn" value="<%= book.getIsbn() %>" /></td></tr>
        <tr><td>Title</td><td><input type="text" name="title" value="<%= book.getTitle() %>" /></td></tr>
        <tr><td>Price</td><td><input type="text" name="price" value="<%= book.getPrice() %>" /></td></tr>
        <tr><td></td><td><input type="submit" value="<%= caption %>" /></td></tr>
    </table>
    </form>
    </body>
</html>
