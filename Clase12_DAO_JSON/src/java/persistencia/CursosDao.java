package persistencia;

import java.sql.*;
import java.util.*;

public class CursosDao {

    public static ArrayList<Curso> consultar()
            throws Exception {
        ArrayList<Curso> listita = new ArrayList();
        Connection conectar = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/capacitaciones_db",
                    "educacion", "educacion");
            PreparedStatement sentencia = conectar.prepareStatement(
                    " SELECT * FROM cursos ");
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Curso actual = new Curso();
                actual.setNombre(resultado.getString("cu_nombre"));
                actual.setReuniones(resultado.getInt("cu_reuniones"));
                listita.add(actual);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("" + ex.getMessage());
            throw ex;
        } finally {
            try {
                conectar.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                throw ex;
            }
        }
        return listita;
    }
}
