<%-- 
    Document   : juego
    Created on : 16-may-2017, 10:04:37
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
  request.setCharacterEncoding("UTF-8");
  double dinero = Double.parseDouble(request.getParameter("dinero"));
  int tiradaAnterior = Integer.parseInt(request.getParameter("tiradaAnterior"));
  int segundaVuelta = Integer.parseInt(request.getParameter("segundaVuelta"));
  int gana = 0;
  int dado1 = (int)(Math.random() * 6 + 1);
  int dado2 = (int)(Math.random() * 6 + 1);
  //Si gana la apuesta gana = 1
  //Si pierde la apuesta gana = 0
  //Si tiene que tirar de nuevo gana = 2
  //Comprobamos si estamos en la segunda etapa
  // NO estamos en segunda vuelta
  if (segundaVuelta == 0){
    if ((dado1 + dado2 == 7) || (dado1 + dado2 == 11)){
      gana = 1;
    } else if ((dado1 + dado2 == 2) || (dado1 + dado2 == 3) || (dado1 + dado2 == 12)){
      gana = 0;
    } else {
      gana = 2;
    }
  //SÍ estamos en segunda etapa
  } else {
    if (tiradaAnterior == (dado1 + dado2)){
      gana = 1;
    } else if ((dado1 + dado2) == 7){
      gana = 0;
    } else {
      gana = 2;
    }
  } 
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ex22img4</title>
  </head>
  <body>
    <h1>Tirada</h1>
    <img src="<%= dado1 %>.png" />
    <img src="<%= dado2 %>.png" />
    <%
      if (gana == 1){
        out.println("<p>Ha ganado " + dinero +"€</p>");
      } else if (gana == 0) {
        out.println("<p>Ha perdido todo el dinero apostado dinero</p>");
      } else {
        %>
        <p>Lo sentimos, tiene que jugar de nuevo</p>
        <form action="juego.jsp" method="POST">
          <input type="hidden" name="dinero" value="<%= dinero %>" />
          <input type="hidden" name="tiradaAnterior" value="<%= (dado1 + dado2) %>" />
          <input type="hidden" name="segundaVuelta" value="1" />
          <input type="submit" value="Jugar de nuevo" />
        </form>
        <%
      }
    %>
  </body>
</html>
