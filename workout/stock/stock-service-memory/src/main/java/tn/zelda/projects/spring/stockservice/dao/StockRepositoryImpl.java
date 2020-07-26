package tn.zelda.projects.spring.stockservice.dao;

import org.springframework.stereotype.Repository;
import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;
import tn.zelda.projects.spring.stockservice.model.StockModel;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class StockRepositoryImpl implements StockRepository {

    private Map<Long, StockEntity> stocks = new ConcurrentHashMap<>(100);
    private AtomicLong index = new AtomicLong();

    public List<StockEntity> findAll() {
        return stocks.values().stream().map(StockEntity::copy).collect(Collectors.toList());
    }

    public StockEntity find(Long id) {
        return stocks.get(id).clone();
    }

    public StockEntity update(Long id, StockModel stockModel) {
        StockEntity stockEntity = stocks.get(id);
        if (stockEntity == null)
            return null;
        else {
            StockEntity stockEntityCopy = StockEntity.copy(stockEntity);
            stockEntityCopy.setName(stockModel.getName());
            stockEntityCopy.setCurrentPrice(stockModel.getCurrentPrice());
            stockEntityCopy.setLastUpdate(new Date());
            return StockEntity.copy(stocks.replace(id, stockEntityCopy));
        }
    }

    public StockEntity create(StockModel stockModel) {
        long id = index.getAndIncrement();
        StockEntity stockToInsert = new StockEntity(stockModel.getName(), stockModel.getCurrentPrice(), new Date());
        return StockEntity.copy(stocks.putIfAbsent(id, stockToInsert));
    }

    public Boolean exists(StockModel stockModel) {
        return stocks.containsValue(new StockEntity(stockModel.getName()));
    }
}
