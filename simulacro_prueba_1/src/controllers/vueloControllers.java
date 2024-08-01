package controllers;

import entities.vuelo;
import models.vueloModel;
import persistence.imodel.IVueloModel;

public class vueloControllers {
    IVueloModel VueloModel= new vueloModel();

    public vuelo create(vuelo request){
        return VueloModel.create(request);
    }
}
