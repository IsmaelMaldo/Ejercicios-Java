<%-- 
    Document   : saludo
    Created on : 10-may-2017, 13:04:18
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 3</title>
  </head>
  <body>
    <h1>Hola <%= request.getParameter("nombre") %></h1>
  </body>
</html>
