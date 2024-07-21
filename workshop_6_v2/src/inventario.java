import java.util.ArrayList;

class inventario {
    private ArrayList<producto> productos;

    public inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(int id) {
        producto productoAEliminar = null;
        for (producto p : productos) {
            if (p.getId() == id) {
                productoAEliminar = p;
                break;  
            }
        }
        
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
        }
    }

    public void listarProductos() {
        float totalInventario= 0;
        for (producto p : productos) {
            System.out.println(p.getId() + ": " + p.getNombre() + " - $" + p.getPrecio());
            totalInventario += p.getPrecio();
        }
        System.out.println("Total del inventario:" +totalInventario);
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado:");
                System.out.println(p.getId() + ": " + p.getNombre() + " - $" + p.getPrecio());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado con nombre: " + nombre);
        }
    }

    public void buscarPorCategoria(String categoria) {
        boolean encontrado = false;
        for (producto p : productos) {
            if (p instanceof productoEspecifico) {
                productoEspecifico pe = (productoEspecifico) p;
                if (pe.getCategoria().equalsIgnoreCase(categoria)) {
                    System.out.println("Producto encontrado:");
                    System.out.println(p.getId() + ": " + p.getNombre() + " - $" + p.getPrecio()
                            + " - Categoria: " + pe.getCategoria() + " - Marca: " + pe.getMarca());
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en la categoría: " + categoria);
        }
    }
}