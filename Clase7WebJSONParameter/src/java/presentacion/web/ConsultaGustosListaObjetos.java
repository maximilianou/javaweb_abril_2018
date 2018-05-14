package presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ConsultaGustosListaObjetos", urlPatterns = {"/ConsultaGustosListaObjetos"})
public class ConsultaGustosListaObjetos extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ArrayList<Map> textoAEnviar = new ArrayList();
        TreeMap<String, String> lemon = new TreeMap();
        lemon.put("gusto", "Lemon Pie");
        lemon.put("calorias", "500");
        textoAEnviar.add(lemon);
        TreeMap<String, String> choco = new TreeMap();
        choco.put("gusto", "Chocolate");
        choco.put("calorias", "3000");
        textoAEnviar.add(choco);
        choco = new TreeMap();
        choco.put("gusto", "Vainilla");
        choco.put("calorias", "1000");
        textoAEnviar.add(choco);
        //System.gc();
        TreeMap<String, String> fruti = new TreeMap();
        fruti.put("gusto", "Frutilla");
        fruti.put("calorias", "200");
        textoAEnviar.add(fruti);

        resp.getWriter().print(
                convertir.toJson(
                        textoAEnviar
                )
        );
    }

}
