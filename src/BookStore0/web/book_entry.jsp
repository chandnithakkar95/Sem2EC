<%@page contentType="text/html" pageEncoding="UTF-8" import="pmj.bookstore.model.Book, pmj.bookstore.model.BookStore"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book-Entry</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    <body>
    <% 
        String update_action;
        Book book;
	String heading = "";
	String caption = "";
        String isbn = request.getParameter("isbn");
        if ( isbn == null ) {
            book = new Book();
            heading = "New Book";
            caption = "Add";
            update_action = "insert";
	}
        else {
            BookStore store = (BookStore) application.getAttribute("store");
            book = store.getBook(isbn);
            heading = "Book - Edit";
            caption = "Update";
            update_action = "update";
	}
    %>
    <h2><%= heading %></h2>
    <form method = "post" action="Update">
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
