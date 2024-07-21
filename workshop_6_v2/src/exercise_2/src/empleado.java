enum TipoEmpleado {
    temporal,
    permanente
}

public class empleado extends persona {
    private int idEmpleado;
    private float salario;
    private TipoEmpleado tipo;
    public empleado(String nombre, int edad, int idEmpleado, float salario, TipoEmpleado tipo) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.tipo = tipo;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public String detalles() {
        return super.detalles() + ", ID Empleado: " + idEmpleado + ", Salario: $" + salario + ", Tipo: " + tipo;
    }


}
