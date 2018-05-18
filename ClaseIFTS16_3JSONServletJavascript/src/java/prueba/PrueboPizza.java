package prueba;

import java.util.ArrayList;

public class PrueboPizza {

    public static void main(String[] args) {
        System.out.println("[..] Pizza");
        Pizza cala = new Pizza();
        cala.setNombre("CalabreSa");
        cala.setPrecio(250);
        System.out.println("Pizzita: " + cala);
        cala = new Pizza();
        System.out.println("Pizzita: " + cala);

        ArrayList<Pizza> comiditas = new ArrayList();

        comiditas.add(cala);

        System.out.println("Listita: " + comiditas);

        Pizza muza = new Pizza();
        muza.setNombre("Muzzarella");
        muza.setPrecio(180);
        comiditas.add(muza);

        System.out.println("Listita: " + comiditas);

//        comiditas.add("Uva fina, carito carito");
        System.out.println("Listita: " + comiditas);

        System.out.println("[OK] Pizza");
    }

}
