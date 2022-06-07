<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Add user</title>
  </head>
  <body>
    <form action="add" method="post">
        <input type="text" name="user">
        <input type="submit">
    </form> <br> 
    <br> <br>

    <form action="home">
        <input type="submit" value = "Menu">
    </form>


  </body>
</html>