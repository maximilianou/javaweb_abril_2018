package pruebas;
import entidades.Rubro;
import java.util.*;
public class TestRubro {
    public static void main(String[] args) {
        System.out.println("[..] TestRubro");
        
        Rubro uno = new Rubro();
        Rubro dos = new Rubro();
        Rubro tres = new Rubro();
        
        ArrayList listadoRubros = new ArrayList();
        listadoRubros.add(uno);
        listadoRubros.add(dos);
        listadoRubros.add(tres);
        listadoRubros.add("Marcelo Tinelli");
        listadoRubros.add("XL Bordo de 5500");

        for(int i =0; i < listadoRubros.size(); i++){
            System.out.println("" + listadoRubros.get(i));
        }
//        for(Rubro elRubroActual : listadoRubros){
//            System.out.println("" + elRubroActual);
//            
//        }
        
        System.out.println("[OK] TestRubro");
    }
    
}







