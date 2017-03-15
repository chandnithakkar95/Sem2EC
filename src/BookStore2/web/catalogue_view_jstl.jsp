<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.ArrayList,pmj.bookstore.model.Book, pmj.bookstore.model.BookStore" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="main.css">
        <title>Books in Stock</title>
    </head>
    <body>
        <h1>Books in Stock [catalogue_view_jstl.jsp]</h1>
        <table class="gridtable">
            <tr><th>ISBN</th><th>Title</th><th>Price</th><th></th><th></th></tr>
            <c:forEach items="${requestScope.stock}" var="s">
            <tr>
                <td><a href="/BookStore2/Controller?action=showbook&isbn=${s.isbn}">${s.isbn}</a></td>
                <td>${s.title}</td>
                <td>${s.price}</td>
                <td><a href="/BookStore2/Controller?action=editbook&isbn=${s.isbn}">Edit</a></td>
                <td><a href="#">Remove</a></td>
            </tr>
            </c:forEach>
        </table>
        <a href="/BookStore2/Controller?action=add">Add New Book</a>
    </body>
</html>
