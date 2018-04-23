package entidades;

public class Rubro implements Comparable {
    
    private String nombre;

    @Override
    public String toString() {
        return "" + nombre; //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object t) {
        return this.getNombre().compareTo( ((Rubro)t).getNombre() );
    }
}
