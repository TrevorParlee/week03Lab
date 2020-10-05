<%-- 
    Document   : editnote
    Created on : Oct 1, 2020, 1:31:51 PM
    Author     : 843327
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    
    <body>
          <h1>Edit Note</h1>
          <form method="post" action="note">
      
        <label>Title: </label><input type="text" name="title" value="${note.title}">
        <br>
        <label>Contents: </label><textarea name="contents">${note.contents}</textarea>
        <br>
        <input type="submit" value="Save">
            
        </form>
    </body>
</html>
