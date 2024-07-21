public class productoEspecifico extends producto {
    private String categoria;
    private String marca;

    public productoEspecifico(int id, String nombre, float precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
