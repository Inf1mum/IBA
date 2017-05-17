package dao.daoImpl;

import dao.DetailsDao;
import entity.Details;
import entity.Good;
import org.springframework.context.annotation.Bean;


public class DetailsDaoImpl extends GenericDaoImpl<Details,Integer> implements DetailsDao {

    public DetailsDaoImpl() {
        super(Details.class);
    }
}
