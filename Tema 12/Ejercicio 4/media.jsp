<%-- 
    Document   : index
    Created on : 10-may-2017, 13:10:17
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  int nota1 = Integer.parseInt(request.getParameter("nota1"));
  int nota2 = Integer.parseInt(request.getParameter("nota2"));
  int nota3 = Integer.parseInt(request.getParameter("nota3"));
  double notaFinal = (nota1 + nota2 + nota3) / 3;
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 4</title>
  </head>
  <body>
    <h1>Media: <%= notaFinal %></h1>
  </body>
</html>
