package pruebas;

import java.util.ArrayList;

public class TestJDBCMedicamento {

    public static void main(String[] args) {
        System.out.println("[..] JDBC al DAO");

        ArrayList<Medicamento> listita;
        try {
            listita = MedicamentosDAO.consultar();
            System.out.println("listita: " + listita);
        } catch (Exception ex) {
            System.out.println("[ERROR] " + ex.getMessage());
        }
        Medicamento uno = new Medicamento();
        MedicamentosDAO.insertar( uno );
        MedicamentosDAO.actualizar( uno );
        MedicamentosDAO.eliminar( uno );
        MedicamentosDAO.bajaLogica( uno );
        MedicamentosDAO.altaLogica( uno );

        System.out.println("[OK] JDBC al DAO");
    }
}
