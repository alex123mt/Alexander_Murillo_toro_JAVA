package entities;

import java.sql.Date;

public class reservacion {
    private int id_pasajero_fk;
    private int id_vuelo_fk;
    private Date fecha_reservacion;
    private String asiento;

    public reservacion(){}

    public reservacion(int id_pasajero_fk, int id_vuelo_fk, Date fecha_reservacion, String asiento) {
        this.id_pasajero_fk = id_pasajero_fk;
        this.id_vuelo_fk = id_vuelo_fk;
        this.fecha_reservacion = fecha_reservacion;
        this.asiento = asiento;
    }
    public int getId_pasajero_fk() {
        return id_pasajero_fk;
    }
    public void setId_pasajero_fk(int id_pasajero_fk) {
        this.id_pasajero_fk = id_pasajero_fk;
    }
    public int getId_vuelo_fk() {
        return id_vuelo_fk;
    }
    public void setId_vuelo_fk(int id_vuelo_fk) {
        this.id_vuelo_fk = id_vuelo_fk;
    }
    public Date getFecha_reservacion() {
        return fecha_reservacion;
    }
    public void setFecha_reservacion(Date fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }
    public String getAsiento() {
        return asiento;
    }
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "reservacion [id_pasajero_fk=" + this.id_pasajero_fk + ", id_vuelo_fk=" + this.id_vuelo_fk + ", fecha_reservacion="
                + this.fecha_reservacion + ", asiento=" + this.asiento + "]";
    }
}
