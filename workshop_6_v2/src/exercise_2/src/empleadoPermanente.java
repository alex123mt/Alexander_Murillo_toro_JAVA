public class empleadoPermanente extends empleado{
    public empleadoPermanente(String nombre, int edad, int idEmpleado, float salario) {
        super(nombre, edad, idEmpleado, salario, TipoEmpleado.permanente);
    }
}
