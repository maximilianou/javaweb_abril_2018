package comparadores;

import entidades.*;
import java.util.Comparator;

public class CriterioPorClienteDNI implements Comparator<Producto>{

    @Override
    public int compare(Producto t, Producto t1) {
        return t.getElPropietario()
                .getDni()
                .compareTo(
                        t1.getElPropietario().getDni());
    }
    
}
