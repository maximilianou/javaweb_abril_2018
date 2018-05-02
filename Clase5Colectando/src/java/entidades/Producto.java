package entidades;

public class Producto implements Comparable<Producto>{

    @Override
    public int compareTo(Producto lat) {
        return this.nombre.compareTo(lat.nombre);
    }
    
    @Override
    public String toString() {
        return nombre + "-" + this.getElPropietario() ; 
    }
    
    
    public Producto(String nombre, Cliente elPropietario) {
        this.setNombre(nombre);
        this.setElPropietario(elPropietario);
    }
    
    private String nombre;
    private Cliente elPropietario;
    

    
    public String getNombre() {
        return nombre;
    }
    public final void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Cliente getElPropietario() {
        return elPropietario;
    }

    public void setElPropietario(Cliente elPropietario) {
        this.elPropietario = elPropietario;
    }


}
