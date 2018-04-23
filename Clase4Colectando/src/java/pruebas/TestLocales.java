package pruebas;

import criterio.CriterioPorRubro;
import entidades.*;
import java.util.*;


public class TestLocales {

    public static void main(String[] args) {
        System.out.println("[..] TestLocales");
        // Collections
        // Collection ( inteface de tooodas las colecciones )
        //   List
        //     ArrayList ( clase hijo de list)
        //   Dictionary ( maestro de {clave:valor} )
        //   Map ( diccionario, o hash, {clave:valor} )
        //   Set ( conjunto )
        //   Iterator ( recorre )
        //   Iterable ( interfaz para implenetar algo 
        //              que puede perdirsele un Iterator )
        //   Comparable
        //   Comparator

        ArrayList<Local> locales = new ArrayList();
        //Set<Local> locales = new TreeSet();

        Rubro electro = new Rubro();
        Rubro ferre = new Rubro();
        Rubro sanit = new Rubro();

        electro.setNombre("Electricidad");
        ferre.setNombre("Ferreteria");
        sanit.setNombre("Sanitario");

        Local ferreSanTelmo = new Local();
        Local electroSanTelmo = new Local();
        Local ferreOnce = new Local();
        Local sanitOnce = new Local();
        Local sanitAlmagro = new Local();

        ferreSanTelmo.setRubro(ferre);
        ferreOnce.setRubro(ferre);
        electroSanTelmo.setRubro(electro);
        sanitAlmagro.setRubro(sanit);
        sanitOnce.setRubro(sanit);

        ferreSanTelmo.setAbierto(true);
        electroSanTelmo.setAbierto(true);
        sanitOnce.setAbierto(false);
        sanitAlmagro.setAbierto(true);
        ferreOnce.setAbierto(false);

        ferreOnce.setNombre("Misserere Fereterium");
        ferreSanTelmo.setNombre("Los Bohemios");
        sanitAlmagro.setNombre("Laburantes");
        sanitOnce.setNombre("Si es necesario");
        electroSanTelmo.setNombre("Electricos & co.");

        locales.add(ferreOnce);
        locales.add(ferreSanTelmo);
        locales.add(sanitOnce);
        locales.add(sanitAlmagro);
        locales.add(electroSanTelmo);
        locales.add(ferreSanTelmo);
        locales.add(electroSanTelmo);

        System.out.println("1. ------------- ");
//        for (int i = 0; i < locales.size(); i++) {
//            System.out.println(" - : " + locales.get(i));
//        }
        System.out.println("2. ------------- ");
        for (Local actual : locales) {
            System.out.println(" - - : " + actual);
        }
        System.out.println("3. ------------- ");

        imprimir(locales.iterator());

        System.out.println("4. ------------- Ordename ");
        Collections.sort(locales);
        imprimir(locales.iterator());
        System.out.println("5. ------------- Ordename Sin qeu se Repita");

        Collections.sort(locales); // lo ordenamos
        TreeSet<Local> ordenarSinRepetir = new TreeSet();
        ordenarSinRepetir.addAll(locales);// luego lo clonamos, para elmentos unicos
        imprimir(ordenarSinRepetir.iterator());

        System.out.println("6. ------------- Ordename por rubro");
        CriterioPorRubro criterioPorRubroUNO = new CriterioPorRubro();
        
        
        Collections.sort(locales, criterioPorRubroUNO); // ordenalo por criterio rubro
        imprimir(locales.iterator());

        // seria para una instancia con distintos criterios de desempate
        CriterioPorRubro criterioPorRubroDOS = new CriterioPorRubro();

        System.out.println("7. ------------- ");

        System.out.println("[OK] TestLocales");
    }

    public static void imprimir(Iterator<Local> recorrer) {
        while (recorrer.hasNext()) {
            System.out.println(" - + - : " + recorrer.next());

        }
    }
}
