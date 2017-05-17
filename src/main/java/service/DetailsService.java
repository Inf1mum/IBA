package service;

import entity.Details;
import entity.Good;

/**
 * Created by Inf1mum on 09.08.2016.
 */
public interface DetailsService {

    public Integer saveDetails(Details details);
    public Details loadDetails(Integer id);
    public Details getDetails(Integer id);
}
