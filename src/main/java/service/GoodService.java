package service;

import entity.Good;


public interface GoodService {

    public Integer saveGood(Good good);
    public Good loadGood(Integer id);
    public Good getGood(Integer id);
}
