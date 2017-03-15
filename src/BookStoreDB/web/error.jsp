<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Error Occurred</title>
    </head>
    <body>
        <h1>Error Occurred</h1>
        <p><% out.println("Error:" + request.getAttribute("error")); %></p>
    </body>
</html>
