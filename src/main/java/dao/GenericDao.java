package dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Inf1mum on 19.09.2015.
 */
public interface GenericDao<E, PK extends Serializable> {

    void update(E obj);
    PK save(E obj);
    List<E> getAll();
    void delete(E obj);
    E load(PK index);
    E get(PK index);
    E merge(E obj);
}
