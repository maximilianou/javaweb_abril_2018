package presentacion;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Producto;

@WebServlet(name = "MostrarJson", urlPatterns = {"/MostrarJson"})
public class MostrarJson extends HttpServlet {

    Gson convertir = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto roastBeef = new Producto();
        roastBeef.setNombre("Roast Beef");
        roastBeef.setPrecio(115);
        Producto asado = new Producto();
        asado.setNombre("Asado");
        asado.setPrecio(99);
        Producto lomo = new Producto();
        lomo.setNombre("Lomo");
        lomo.setPrecio(145);
        
        ArrayList<Producto> listado = new ArrayList();
        listado.add( lomo );
        listado.add( asado );
        listado.add( roastBeef );
        
        TreeMap<String, ArrayList> respuesta = new TreeMap();
        respuesta.put("ListadoProductos", listado);
        
        response.getWriter().print( convertir.toJson(respuesta) );
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
