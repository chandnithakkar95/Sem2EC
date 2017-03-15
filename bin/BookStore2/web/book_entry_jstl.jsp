<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book-Entry</title>
    </head>
    <body>
    <h1>Books Entry</h1>
    <jsp:useBean id="book" class="pmj.bookstore.model.Book" scope="request" />
    <table>
        <tr><td>ISBN</td><td><input type="text" value="<jsp:getProperty name="book" property="isbn"/>"/></td></tr>
        <tr><td>Title</td><td><input type="text" value="<jsp:getProperty name="book" property="title"/>"/></td></tr>
        <tr><td>Price</td><td><input type="text" value="<jsp:getProperty name="book" property="price"/>"/></td></tr>
        <tr><td></td><td><input type="button" value="Save" /></td></tr>
    </table>        
    </body>
</html>
