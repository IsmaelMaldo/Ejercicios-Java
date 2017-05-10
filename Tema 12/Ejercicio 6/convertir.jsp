<%-- 
    Document   : convertir.jsp
    Created on : 10-may-2017, 17:20:17
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  double numero = Double.parseDouble(request.getParameter("numero"));
  double resultado = ((Double.parseDouble(request.getParameter("numero"))) / 1.66) / 100;
  
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 5</title>
  </head>
  <body>
    <h1><% out.print(String.format("%.0f", numero)); %> Pesetas = <% out.print(String.format("%.2f", resultado)); %> Euros</h1>
  </body>
</html>
