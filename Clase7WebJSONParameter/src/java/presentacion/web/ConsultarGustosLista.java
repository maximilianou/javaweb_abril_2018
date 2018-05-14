package presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ConsultarGustosLista", urlPatterns = {"/ConsultarGustosLista"})
public class ConsultarGustosLista extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ArrayList<String> textoAEnviar = new ArrayList();
        textoAEnviar.add("Lemon Pie");
        textoAEnviar.add("Pistacco");
        textoAEnviar.add("Chocolate");
        textoAEnviar.add("Manjar Blanco");
        
        resp.getWriter().print(
                convertir.toJson(
                        textoAEnviar
                )
        );
    }

}
