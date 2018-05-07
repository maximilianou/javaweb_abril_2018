package presentacion.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "ServidorJotaSon", urlPatterns = {"/ServidorJotaSon"})
public class ServidorJotaSon extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.getWriter().print("Esta Funcionando!!! GET consultar");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.getWriter().print("Esta Funcionando!!! POST insertar");
    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          resp.getWriter().print("Esta Funcionando!!! PUT Actualizar");
    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          resp.getWriter().print("Esta Funcionando!!! DELETE borrar");
    }
    
    
}
