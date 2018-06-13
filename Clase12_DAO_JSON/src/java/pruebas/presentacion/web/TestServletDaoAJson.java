/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.presentacion.web;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Curso;
import persistencia.CursosDao;

@WebServlet(name = "TestServletDaoAJson", urlPatterns = {"/TestServletDaoAJson"})
public class TestServletDaoAJson extends HttpServlet {

    Gson convetir = new Gson();
            
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ArrayList<Curso> lista = CursosDao.consultar();

            response.getWriter().print( convetir.toJson( lista ) );
        } catch (Exception ex) {
            
            response.getWriter().print( convetir.toJson( ex.getMessage() ) );
        }
    }
}
