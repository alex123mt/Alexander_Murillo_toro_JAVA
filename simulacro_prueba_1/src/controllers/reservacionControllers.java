package controllers;

import entities.reservacion;
import models.reservacionModel;
import persistence.imodel.IReservacionModel;

public class reservacionControllers {
    IReservacionModel ReservacionModel= new reservacionModel();

    public reservacion create (reservacion request){
        return this.ReservacionModel.create(request);
    }
}
