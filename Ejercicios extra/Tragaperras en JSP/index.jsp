<%-- 
    Document   : tragaperras
    Created on : 20-abr-2017, 12:51:45
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <%
    int numero1 = (int)(Math.random() * 5);
    int numero2 = (int)(Math.random() * 5);
    int numero3 = (int)(Math.random() * 5);
    %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tragaperras</title>
    <style>
      body {
        margin: 0;
        text-align: center;
      }
      div {
        width: 98vw;
        margin: auto;
      }
      img {
        width: 27%;
        margin: 3%;
      }
    </style>
  </head>
  <body>
    <h1>Máquina tragaperras, pruebe suerte ;)</h1>
    <div>
    <%
    switch (numero1) {
      case 0:
        out.println("<img src=\"diamante.svg\">");
        break;
      case 1:
        out.println("<img src=\"herradura.svg\">");
        break;
      case 2:
        out.println("<img src=\"campana.svg\">");
        break;
      case 3:
        out.println("<img src=\"corazon.svg\">");
        break;
      case 4:
        out.println("<img src=\"rombo.svg\">");
        break;
    }
    switch (numero2) {
      case 0:
        out.println("<img src=\"diamante.svg\">");
        break;
      case 1:
        out.println("<img src=\"herradura.svg\">");
        break;
      case 2:
        out.println("<img src=\"campana.svg\">");
        break;
      case 3:
        out.println("<img src=\"corazon.svg\">");
        break;
      case 4:
        out.println("<img src=\"rombo.svg\">");
        break;
    }
    switch (numero3) {
      case 0:
        out.println("<img src=\"diamante.svg\">");
        break;
      case 1:
        out.println("<img src=\"herradura.svg\">");
        break;
      case 2:
        out.println("<img src=\"campana.svg\">");
        break;
      case 3:
        out.println("<img src=\"corazon.svg\">");
        break;
      case 4:
        out.println("<img src=\"rombo.svg\">");
        break;
    }
    %>
    </div>
    <p>
    <%
    if ((numero1 == numero2) && (numero1 == numero3)) {
      out.println("Enhorabuena, ha ganado 10 monedas");
    } else if ((numero1 == numero2) || (numero1 == numero3) || (numero2 == numero3)) {
      out.println("Bien, ha recuperado su moneda");
    } else {
      out.println("Lo siento, ha perdido");
    }
    %>
    </p>
    <p>
        <input type="button" value="Tirar de nuevo" onclick = "location.reload()" />
    </p>
  </body>
</html>
