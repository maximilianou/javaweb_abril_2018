package entidades;

/**
 *
 * @author educacion
 */
public class Proveedor  implements Comparable<Proveedor>{
    private String cuit;
    private String domicilio;    

    
    @Override
    public String toString() {
        return "" + cuit + " :: "+domicilio; 
    }


    
    public String getCuit() {
        return cuit;
    }
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public int compareTo(Proveedor elOtro) {
       return this.cuit.compareTo( elOtro.getCuit() );
    }
}
