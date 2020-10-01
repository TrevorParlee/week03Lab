<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 1:31:36 PM
    Author     : 843327
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple  Note Keeper</title>
    </head>
    <body>
        <h1>View Note </h1>
        <br>
        <label>Title:</label><p>${note.title}</p>
        <br>
        <label>Contents: </label>
        <br>
        <p>${note.contents}</p>
        
        <a href="note">Edit</a>
        
    </body>
</html>
