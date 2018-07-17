package clase05;

public class Persona {
    private String nombre;
    private String apellido;
    private Genero genero;
    private Estado estado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Genero genero, Estado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", estado=" + estado + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
