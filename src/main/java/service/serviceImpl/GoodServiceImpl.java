package service.serviceImpl;

import dao.GoodDao;
import entity.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.GoodService;

/**
 * Created by Inf1mum on 07.08.2016.
 */
@Service
public class GoodServiceImpl implements GoodService {


    @Autowired
    @Qualifier("goodDao")
    private GoodDao goodDao;

    public GoodDao getGoodDao() {
        return goodDao;
    }

    @Transactional
    @Override
    public Integer saveGood(Good good) {
        return getGoodDao().save(good);
    }

    @Transactional
    @Override
    public Good loadGood(Integer id) {
        return getGoodDao().load(id);
    }

    @Transactional
    @Override
    public Good getGood(Integer id) {
        return getGoodDao().get(id);
    }
}
