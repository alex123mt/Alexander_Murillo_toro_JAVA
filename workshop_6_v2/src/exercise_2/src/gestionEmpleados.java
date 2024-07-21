import java.util.ArrayList;

public class gestionEmpleados {
    private ArrayList<empleado> empleados;
    private int proximoId;

    public gestionEmpleados() {
        empleados = new ArrayList<>();
        proximoId = 1; 
    }

    public void agregarEmpleado(empleado empleado) {
        empleado.setIdEmpleado(proximoId);
        empleados.add(empleado);
        proximoId++;
        System.out.println("** Empleado añadido correctamente **");
    }

    public void eliminarEmpleado(int idEmpleado) {
        boolean encontrado = false;
        for (empleado emp : empleados) {
            if (emp.getIdEmpleado() == idEmpleado) {
                empleados.remove(emp);
                System.out.println("** Empleado eliminado correctamente **");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún empleado con el ID proporcionado.");
        }
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("-- Lista de empleados:");
            for (empleado emp : empleados) {
                System.out.println(emp.detalles());
            }
        }
    }

}
