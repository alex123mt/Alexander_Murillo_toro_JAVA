package persistence.imodel;

import entities.avion;
import persistence.crud.CreateModel;
// import persistence.crud.DeleteModel;
import persistence.crud.DeleteModel;

public interface IAvionModel extends CreateModel<avion>, DeleteModel<Integer>{

}
