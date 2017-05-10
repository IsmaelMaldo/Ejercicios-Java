<%-- 
    Document   : convertir.jsp
    Created on : 10-may-2017, 17:20:17
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  double numero = Double.parseDouble(request.getParameter("numero"));
  int resultado = (int)(numero * 100 * 1.66);
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 5</title>
  </head>
  <body>
    <h1><% out.print(String.format("%.2f", numero)); %> Euros = <% out.print(String.format("%d", resultado)); %> Pesetas</h1>
  </body>
</html>
