package controllers;

import entities.pasajero;
import models.pasajeroModel;
import persistence.imodel.IPasajeroModel;

public class pasajeroControllers {
    IPasajeroModel PasajeroModel= new pasajeroModel();

    public pasajero create (pasajero request){
        return this.PasajeroModel.create(request);
    }
}
