<%-- 
    Document   : reloj
    Created on : 16-may-2017, 9:39:51
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("UTF-8");
  String material = request.getParameter("material");
  String color = request.getParameter("color");
  int precio = 0;
  boolean gratis = false;
  
  if (((int)(Math.random() * 4) != 0)){
    if (material.equals("acero")){
      precio += 4500;
    } else {
      precio += 9000;
    }
    if (color.equals("azul")){
      precio += 600;
    } else if (color.equals("negro")){
      precio += 800;
    } else {
      precio += 1000;
    }
  } else {
    gratis = true;
  }
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ex22img3</title>
  </head>
  <body>
    <h1>Aquí tiene su reloj</h1>
    <%
      if (material.equals("acero") && color.equals("azul")){
        out.println("<img src=\"reloj_acero_azul.png\" />");
      } else if (material.equals("acero") && color.equals("negro")){
        out.println("<img src=\"reloj_acero_negro.png\" />");
      } else if (material.equals("acero") && color.equals("verde")){
        out.println("<img src=\"reloj_acero_verde.png\" />");
      } else if (material.equals("oro") && color.equals("azul")){
        out.println("<img src=\"reloj_oro_azul.png\" />");
      } else if (material.equals("oro") && color.equals("negro")){
        out.println("<img src=\"reloj_oro_negro.png\" />");
      } else if (material.equals("oro") && color.equals("verde")){
        out.println("<img src=\"reloj_oro_verde.png\" />");
      }
      if (gratis){
        out.println("<p>¡Enhorabuena!¡Su reloj le ha salido gratis!</p>");
      } else {
        out.println("<p>Su reloj cuesta " + precio + "€</p>");
      }
    %>
  </body>
</html>
