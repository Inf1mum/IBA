package dao.daoImpl;

import dao.GoodDao;
import entity.Good;


public class GoodDaoImpl extends GenericDaoImpl<Good,Integer> implements GoodDao {

    public GoodDaoImpl() {
        super(Good.class);
    }

}
