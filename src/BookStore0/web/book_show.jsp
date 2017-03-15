<%@page contentType="text/html" pageEncoding="UTF-8" import="pmj.bookstore.model.Book, pmj.bookstore.model.BookStore"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book-Show</title>
        <link rel="stylesheet" type="text/css" href="main.css">
    </head>
    <body>
    <% 
        Book book;
        String isbn = request.getParameter("isbn");
        BookStore store = (BookStore) application.getAttribute("store");
        book = store.getBook(isbn);
    %>
    <h2>Book-Details</h2>
    <table class="gridtable">
        <tr><td>ISBN</td><td><%= book.getIsbn() %></td></tr>
        <tr><td>Title</td><td><%= book.getTitle() %></td></tr>
        <tr><td>Price</td><td><%= book.getPrice() %></td></tr>
    </table>
    </form>
    </body>
</html>
