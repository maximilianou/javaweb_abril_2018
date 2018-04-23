package entidades;

public class Local implements Comparable<Local> {

    private String nombre;
    private String direccion;
    private String numero;
    private boolean abierto = false;
    private Rubro rubro;

//    @Override
//    public int compareTo(Object t) {
//       return this.nombre.compareTo( ((Local)t).getNombre() );
//    }
    @Override
    public int compareTo(Local t) {
       return this.nombre.compareTo( t.getNombre() );
    }
    
    
    @Override
    public String toString() {
        return "Local Nombre: " + nombre
                + " Estado: " + abierto
                + " Rubro " + rubro ;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nnombre) {
        this.nombre = nnombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    
}
