package presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Comidas", urlPatterns = {"/Comidas"})
public class Comidas extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String mandaComida = "Pizza de Calabresa, 250";

        ArrayList<TreeMap> mandaComida = new ArrayList();
        
        TreeMap<String, String> unaComida = new TreeMap();
        unaComida.put("nombre", "Muzzarela");
        unaComida.put("precio", "170");
        mandaComida.add(unaComida);

        unaComida = new TreeMap();
        unaComida.put("nombre", "Napo");
        unaComida.put("precio", "200");
        
        mandaComida.add(unaComida);

        
        resp.getWriter().print(convertir.toJson(mandaComida));

    }

}
