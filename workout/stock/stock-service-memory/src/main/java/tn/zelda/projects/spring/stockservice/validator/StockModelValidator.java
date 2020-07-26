package tn.zelda.projects.spring.stockservice.validator;

import org.springframework.stereotype.Service;
import tn.zelda.projects.spring.stockservice.exception.ApiBadRequestException;
import tn.zelda.projects.spring.stockservice.model.StockModel;

@Service
public class StockModelValidator {

    public void validateStockModel(StockModel stockModel) throws ApiBadRequestException {
        if (stockModel == null || stockModel.getName().trim().equals("") && stockModel.getCurrentPrice() <= 0.0)
            throw new ApiBadRequestException("In valid stock name and price");

        if (stockModel != null && stockModel.getName().trim().equals(""))
            throw new ApiBadRequestException("In valid stock name");

        if (stockModel != null && stockModel.getCurrentPrice() <= 0.0)
            throw new ApiBadRequestException("In valid stock price");
    }
}
