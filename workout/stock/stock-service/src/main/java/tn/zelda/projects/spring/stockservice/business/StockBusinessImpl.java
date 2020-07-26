package tn.zelda.projects.spring.stockservice.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import tn.zelda.projects.spring.stockservice.dao.StockRepository;
import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;
import tn.zelda.projects.spring.stockservice.model.StockModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockBusinessImpl implements StockBusiness {

    @Autowired
    private StockRepository stockRepository;

    final Integer PAGE_SIZE = 50;

    public List<StockModel> getAllStocks(int page){
        PageRequest pageable = new PageRequest(page, PAGE_SIZE);
        Page<StockEntity> p = stockRepository.findAll(pageable);
        if (p != null && p.getSize()> 0)
            return StockFactory.toStockModelList( p.getContent());
        else
            return new ArrayList<StockModel>();
    }

    public StockModel getStock(long id) {
        return StockFactory.toStockModel(stockRepository.findOne(id));
    }

    public StockModel saveStock(StockModel newStockModel) {
        StockEntity newStockEntity = StockFactory.toStockEntity(newStockModel);
        return StockFactory.toStockModel(stockRepository.save(newStockEntity));
    }


    public StockModel updateStock(StockModel stockModel, long id) {
        StockEntity newStockEntity = StockFactory.toStockEntity(stockModel);
        newStockEntity.setId(id);
        return StockFactory.toStockModel(stockRepository.save(newStockEntity));
    }

    public Boolean exist(Long id) {
        StockModel stockModel = getStock(id);
        if (stockModel == null)
            return false;
        else
            return true;
    }

    public Boolean exist(String name) {
        StockEntity stockEntityDb =stockRepository.findByName(name);
        if (stockEntityDb == null)
            return false;
        else
            return true;
    }
}
