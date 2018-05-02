package entidades;

public class Cliente {
    // Constuctor
    public Cliente(String dni, String nombre, String apellido){
        this.setApellido(apellido);
        this.setDni(dni);
        this.setNombre(nombre);
        //this.nombre = nombre;
        
    }
    // atritubos
    private String nombre;
    private String apellido;
    private String dni;
    
    // metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
}
