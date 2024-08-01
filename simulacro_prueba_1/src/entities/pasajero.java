package entities;

public class pasajero {
    private String nombre;
    private String apellido;
    private String documento_identidad;

    public pasajero(){}

    public pasajero(String nombre, String apellido, String documento_identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento_identidad = documento_identidad;
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
    public String getDocumento_identidad() {
        return documento_identidad;
    }
    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    @Override
    public String toString() {
        return "pasajero [nombre=" + this.nombre + ", apellido=" + this.apellido + ", documento_identidad=" + this.documento_identidad
                + "]";
    }
    
}
