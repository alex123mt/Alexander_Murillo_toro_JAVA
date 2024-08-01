package persistence.imodel;

import entities.userEntity;
import persistence.crud.CreateModel;
import persistence.crud.DeleteModel;

public interface IUserModel extends CreateModel<userEntity> ,DeleteModel<String> {

}
