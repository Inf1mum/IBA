package service;

import entity.Good;

/**
 * Created by Inf1mum on 07.08.2016.
 */
public interface GoodService {

    public Integer saveGood(Good good);
    public Good loadGood(Integer id);
    public Good getGood(Integer id);
}
