package tn.zelda.projects.spring.stockservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.zelda.projects.spring.stockservice.dao.StockRepository;
import tn.zelda.projects.spring.stockservice.model.StockModel;

@Service
public class AppInitializer {
    @Autowired
    StockRepository stockRepository;

    public void init() {
        stockRepository.create(new StockModel(1, "A", 100.0));
        stockRepository.create(new StockModel(2, "B", 200.0));
        stockRepository.create(new StockModel(3, "C", 300.0));
        stockRepository.create(new StockModel(4, "D", 400.0));
        stockRepository.create(new StockModel(4, "D", 500.0));
    }

}
