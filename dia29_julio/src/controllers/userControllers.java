package controllers;

import entities.userEntity;
import models.userModel;
import persistence.imodel.IUserModel;

public class userControllers {

    IUserModel UserModel= new userModel();

    public userEntity create(userEntity request){


        return this.UserModel.create(request);
        // return this.userModel.create(request);
    }
}
