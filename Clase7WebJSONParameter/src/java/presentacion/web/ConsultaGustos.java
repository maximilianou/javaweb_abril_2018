package presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ConsultaGustos", urlPatterns = {"/ConsultaGustos"})
public class ConsultaGustos extends HttpServlet {

    Gson convertir = new Gson();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
      resp.getWriter().print(
              convertir.toJson(
                   "Funciona Gustos de Helados!!"
              )
      );
    }

    

}
