package service.serviceImpl;


import dao.DetailsDao;
import entity.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.DetailsService;

/**
 * Created by Inf1mum on 09.08.2016.
 */
@Service
public class DetailsServiceImpl implements DetailsService {

    @Autowired
    @Qualifier("detailsDao")
    private DetailsDao detailsDao;

    public DetailsDao getDetailsDao() {
        return detailsDao;
    }

    @Transactional
    @Override
    public Integer saveDetails(Details details) {
        return getDetailsDao().save(details);
    }

    @Transactional
    @Override
    public Details loadDetails(Integer id) {
        return getDetailsDao().load(id);
    }

    @Transactional
    @Override
    public Details getDetails(Integer id) {
        return getDetailsDao().get(id);
    }
}
