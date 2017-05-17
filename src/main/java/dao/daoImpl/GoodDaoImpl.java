package dao.daoImpl;

import dao.GoodDao;
import entity.Good;

/**
 * Created by Inf1mum on 07.08.2016.
 */
public class GoodDaoImpl extends GenericDaoImpl<Good,Integer> implements GoodDao {

    public GoodDaoImpl() {
        super(Good.class);
    }

}
