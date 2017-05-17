package service;

import entity.Details;
import entity.Good;


public interface DetailsService {

    public Integer saveDetails(Details details);
    public Details loadDetails(Integer id);
    public Details getDetails(Integer id);
}
