package tn.zelda.projects.spring.stockservice.dao;


import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;
import tn.zelda.projects.spring.stockservice.model.StockModel;

import java.util.List;


public interface StockRepository {
    public List<StockEntity> findAll();

    public StockEntity create(StockModel stockModel);

    public StockEntity update(Long id, StockModel stockModel);

    public StockEntity find(Long id);

    public Boolean exists(StockModel stockModel);
}
