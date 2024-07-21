
public class empleadoTemporal extends empleado{
    public empleadoTemporal(String nombre, int edad, int idEmpleado, float salario) {
        super(nombre, edad, idEmpleado, salario, TipoEmpleado.temporal);
    }

}