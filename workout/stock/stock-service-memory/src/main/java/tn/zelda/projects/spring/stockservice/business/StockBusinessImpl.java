package tn.zelda.projects.spring.stockservice.business;

import org.springframework.beans.factory.annotation.Autowired;
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


    public List<StockModel> getAllStocks() {
        List<StockEntity> p = stockRepository.findAll();
        if (p != null && p.size() > 0)
            return StockFactory.toStockModelList(p);
        else
            return new ArrayList<StockModel>();
    }

    public StockModel getStock(long id) {
        return StockFactory.toStockModel(stockRepository.find(id));
    }

    public StockModel updateStock(StockModel stockModel, long id) {

        return StockFactory.toStockModel(stockRepository.update(id, stockModel));
    }


    public StockModel saveStock(StockModel newStockModel) {
        return StockFactory.toStockModel(stockRepository.create(newStockModel));
    }

    public Boolean exist(StockModel newStockModel) {
        return stockRepository.exists(newStockModel);
    }


}
