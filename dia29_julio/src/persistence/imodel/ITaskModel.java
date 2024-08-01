package persistence.imodel;

import entities.task;
import persistence.crud.CreateModel;
import persistence.crud.DeleteModel;

public interface ITaskModel extends
    CreateModel<task>,
    DeleteModel<Integer>{
}
