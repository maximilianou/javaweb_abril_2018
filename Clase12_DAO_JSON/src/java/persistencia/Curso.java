package persistencia;

public class Curso {

    private String nombre;
    //private double nombre;
//    private void nombre(){
//    }
    private int reuniones;
    
    @Override
    public String toString() {
        return "" + nombre + "__" + reuniones; 
    }
    
    //@Override
//    public String toString(String pepe) {
//        return "" + nombre + " ROBERTO " + reuniones; 
//    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getReuniones() {
        return reuniones;
    }
    public void setReuniones(int reuniones) {
        this.reuniones = reuniones;
    }
    
}
