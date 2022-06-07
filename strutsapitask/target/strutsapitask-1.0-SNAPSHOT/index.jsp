<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1> <br> 
    
    <form action="add" method="post">
        <input type="submit" value = "Add User">
    </form> <br>

    <form action="read" method="post">
        <input type="submit" value = "View Users">
    </form> <br> 

    <form action="delete" method="post">
        <input type="submit" value = "Delete User">
    </form> <br> 
 
    <form action="update" method="post">
        <input type="submit" value = "Update Users">
    </form> <br> 

  </body>
</html>