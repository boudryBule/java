package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8"); //indicamos de qué tipo va a ser la respuesta
        PrintWriter out = response.getWriter(); //con el objeto out es con el que podemos imprimir en consola, que en este caso va a ser al navegador web
        out.println("Hola mundo desde Servlets");
    }
}
