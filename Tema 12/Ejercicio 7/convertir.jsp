<%-- 
    Document   : convertir
    Created on : 10-may-2017, 18:29:44
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  double numero = Double.parseDouble(request.getParameter("numero"));
  int opcion = Integer.parseInt(request.getParameter("conver"));
  double resultado = 0;
  if (opcion == 0){
    resultado = numero * 100 * 1.66;
  } else {
    resultado = numero / 100 / 1.66;
  }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 7</title>
  </head>
  <body>
    <p>
    <%
      if (opcion == 0){
        out.println(String.format("%.2f Euros = %.0f Pesetas", numero , resultado));
      } else {
        out.println(String.format("%.0f Pesetas = %.2f Euros", numero , resultado));
      }
    %>
    </p>
    <img src="imagen.png" width="100px"/>
  </body>
</html>
