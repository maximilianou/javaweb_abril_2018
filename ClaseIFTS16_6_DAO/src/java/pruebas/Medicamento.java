package pruebas;

class Medicamento {
    private String nombre;
    private int precio;
    @Override
    public String toString() {
        return "" + nombre + ": "+ precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
