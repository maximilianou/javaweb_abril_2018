package presentacion.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author educacion
 */
@WebServlet(name = "Ventas", urlPatterns = {"/Ventas"})
public class Ventas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Ventas</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Ventas at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter salida = response.getWriter();

        salida.print("Primer Texto para la web");
        salida.print("Primer Texto para la web");

        try {
            //        processRequest(request, response);
            // 1. Queremos Acceder a la Base de DAtos
            // 2. creamos la base de datos

            // 0. el driver de conexion con la Base acual
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // 1. conectar
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gestion_ventas_db",
                    "educacion",
                    "educacion");
            salida.print("\n Coneccion OK \n");
            // 2. sentenncia
            PreparedStatement sentencia =
                    conectar.prepareStatement(
                            " SELECT * FROM ventas ");
            // 3. resultado mostrar
            ResultSet resultado = sentencia.executeQuery();
            while( resultado.next() ){
            salida.print("\n "+ 
                    resultado.getString("ven_numero")
                    +" \n");
            }
            // 4. capturar errores
            // 5. cerrar conexion

        } catch (Exception ex) {
            salida.print("\n Coneccion ERROR \n" 
            + ex.getMessage());
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
