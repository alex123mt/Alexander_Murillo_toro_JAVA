import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inventario inventario = new inventario();

        boolean salir = false;

        while (!salir) {
            System.out.println("=== Menú de Opciones ===");
            System.out.println("1 para agregar Producto, 2 para eliminar Producto, 3 para listar Productos, 4 para buscar Producto por Nombre, 5 para buscar Producto por Categoría y 6 para Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:

                    System.out.println("=== Agregar Producto ===");
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el precio del producto: ");
                    float precio = scanner.nextFloat();
                    scanner.nextLine();

                    System.out.print("Ingrese la categoría del producto: ");
                    String categoria = scanner.nextLine();

                    System.out.print("Ingrese la marca del producto: ");
                    String marca = scanner.nextLine();

                    productoEspecifico producto = new productoEspecifico(id, nombre, precio, categoria, marca);
                    inventario.agregarProducto(producto);

                    System.out.println("Producto agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("=== Eliminar Producto ===");
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();
                    inventario.eliminarProducto(idEliminar);
            
                    System.out.println("Producto eliminado exitosamente.");
                    break;
                case 3:
                    System.out.println("=== Listado de Productos ===");
                    inventario.listarProductos();

                    break;
                case 4:
                    System.out.println("=== Buscar Producto por Nombre ===");
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
            
                    inventario.buscarPorNombre(nombreBuscar);
                    break;
                case 5:
                    System.out.println("=== Buscar Producto por Categoría ===");
                    System.out.print("Ingrese la categoría del producto a buscar: ");
                    String categoriaBuscar = scanner.nextLine();
            
                    inventario.buscarPorCategoria(categoriaBuscar);
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
