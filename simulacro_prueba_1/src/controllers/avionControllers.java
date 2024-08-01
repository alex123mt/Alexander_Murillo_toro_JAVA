package controllers;

import entities.avion;
import models.avionModel;
import persistence.imodel.IAvionModel;

public class avionControllers {
    IAvionModel AvionModel= new avionModel();

    public avion create (avion request){
        return this.AvionModel.create(request);
    }
}
