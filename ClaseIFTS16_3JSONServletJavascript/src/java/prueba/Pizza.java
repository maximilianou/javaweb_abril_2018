package prueba;

public class Pizza {
    private String nombre;
    private double precio;

//    @Override
//    public String toString() {
//        return "" + nombre + " : " + precio ; 
//    }

    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if( precio < 1){
            throw new RuntimeException("Olvidate!! precio negativo NO " + precio);
        }
        this.precio = precio;
    }
}
