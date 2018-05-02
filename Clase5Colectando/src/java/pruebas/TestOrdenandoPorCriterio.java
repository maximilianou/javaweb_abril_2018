package pruebas;

import comparadores.CriterioPorClienteDNI;
import entidades.Cliente;
import entidades.Producto;
import java.util.*;

/**
 * <pre>
 * Referencia, comienzo encarando la programacion
 * del ejercicio, con TDD  como concepto basico.
 * https://en.wikipedia.org/wiki/Test-driven_development
 * https://en.wikipedia.org/wiki/Extreme_programming
 * </pre>
 */
public class TestOrdenandoPorCriterio {

    public static void main(String[] args) {
        System.out.println("[..] Por Criterio");

        System.out.println("1. --------------");
        // Crear una clase Producto
        // Creacion de sitios web
        //  con componentes o modulos de:
        //   registracion de usuarios
        //   chat con la empresa
        //   relacion con el cliete, que puedan quejarse, CRM
        //   publicacion de contenidos CMS
        //   
        Cliente mary = new Cliente("11111111", "Maria", "Martinez");
        Cliente camy = new Cliente("4444444", "Camyla", "Lopez");
        Cliente carly = new Cliente("666666666", "Carlyna", "Surundi");
        Producto sitioMary = new Producto("carniceria web", mary);
        Producto sitioDosMary = new Producto("fotografias panoramicas", mary);
        Producto sitioTresMary = new Producto("pedicuria fina", mary);
        Producto sitioCamy = new Producto("maquina pa hacer pochoclo", camy);
        Producto sitioCarly = new Producto("farmapueblo", carly);

        System.out.println("2. --------------");
        ArrayList<Producto> listaProductos = new ArrayList();
        listaProductos.add(sitioCamy);
        listaProductos.add(sitioTresMary);
        listaProductos.add(sitioCarly);
        listaProductos.add(sitioDosMary);
        listaProductos.add(sitioMary);
        listaProductos.add(sitioTresMary);
        System.out.println("Cantidad en Lista Productos: "
                + listaProductos.size());
        System.out.println("3. --------------");
        TreeSet<Producto> arbolProductos = new TreeSet();
        arbolProductos.addAll(listaProductos);
        System.out.println("Cantidad en Arbol : "
                + arbolProductos.size());
        System.out.println("4. --------------");
        //Set uno = new Set(); // no puedo instanciar interfaces
        Set uno = new TreeSet(); // necesito clases concretas
        System.out.println("5. --------------");
        System.out.println("Lista SIN OrdenaR:"
                + listaProductos);
        Collections.sort(listaProductos);
        //Collections.sort(arbolProductos); // no puedo ordenar sin o tengo indice del orden
        System.out.println("Lista Ordenada Naturalment:"
                + listaProductos);
        Collections.reverse(listaProductos);
        System.out.println("Lista Ordenada Inversamente:"
                + listaProductos);
        System.out.println("6. --------------");
        // por DNI del cliente
        CriterioPorClienteDNI criterioDNI = new CriterioPorClienteDNI();
        Collections.sort(listaProductos, criterioDNI);
        System.out.println("Orden por DNI:"
                + listaProductos);
        Collections.sort(listaProductos, 
                Collections.reverseOrder(criterioDNI) );
        System.out.println("Inverso por DNI:"
                + listaProductos);
        System.out.println("7. --------------");
        // por apellido, desempata por nombre
        Collections.sort(listaProductos);
        
        System.out.println("8. --------------");

        System.out.println("[OK] Por Criterio");
    }
}
