package pruebas;

import java.sql.*;
import java.util.*;

class MedicamentosDAO {

    static ArrayList<Medicamento> consultar() throws Exception {
        ArrayList<Medicamento> lista = new ArrayList();
        Class.forName("com.mysql.jdbc.Driver").newInstance(); // 1.
        Connection conectar = DriverManager.getConnection( // 2.
                "jdbc:mysql://localhost/farmacia_db",
                "educacion",
                "educacion");
        PreparedStatement sentencia = conectar.prepareCall(
                "SELECT * FROM medicamentos ");
        ResultSet resultado = sentencia.executeQuery();  // 4.
        while (resultado.next()) { // 5. listOO
            Medicamento paraceta = new Medicamento();
            paraceta.setNombre(  resultado.getString("med_nombre")  );
            paraceta.setPrecio(  resultado.getInt("med_precio") );
            lista.add(paraceta);
        }
        return lista;
    }
    static void insertar(Medicamento uno) {

    }
    static void actualizar(Medicamento uno) {

    }
    static void eliminar(Medicamento uno) {

    }
    static void bajaLogica(Medicamento uno) {

    }
    static void altaLogica(Medicamento uno) {

    }

}
