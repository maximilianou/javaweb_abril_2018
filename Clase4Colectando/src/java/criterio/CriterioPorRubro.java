package criterio;

import entidades.*;
import java.util.*;

public class CriterioPorRubro implements Comparator<Local> {

    @Override
    public int compare(Local primero, Local segundo) {
       return primero.getRubro().compareTo( segundo.getRubro() );
    }
    
}
