package tn.zelda.projects.spring.stockservice.business;

import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;
import tn.zelda.projects.spring.stockservice.model.StockModel;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class StockFactory {

    public static StockModel toStockModel(StockEntity stockEntity) {
        return stockEntity != null ? new StockModel(stockEntity.getId(), stockEntity.getName(), stockEntity.getCurrentPrice()) : null;
    }

    public static List<StockModel> toStockModelList(List<StockEntity> stockEntities) {
        return stockEntities
                .stream()
                .map(stock -> toStockModel(stock))
                .collect(Collectors.toList());
    }

    public static StockEntity toStockEntity(StockModel stockModel) {
        if (stockModel == null) return null;
        else {
            StockEntity newStockEntity = new StockEntity();
            newStockEntity.setLastUpdate(new Date());
            newStockEntity.setName(stockModel.getName());
            newStockEntity.setCurrentPrice(stockModel.getCurrentPrice());
            return newStockEntity;
        }

    }

}
