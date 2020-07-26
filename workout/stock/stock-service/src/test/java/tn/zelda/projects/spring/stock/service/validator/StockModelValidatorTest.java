package tn.zelda.projects.spring.stock.service.validator;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import tn.zelda.projects.spring.stockservice.exception.ApiBadRequestException;
import tn.zelda.projects.spring.stockservice.model.StockModel;
import tn.zelda.projects.spring.stockservice.validator.StockModelValidator;


public class StockModelValidatorTest {

    private StockModelValidator stockModelValidator;

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void init(){
        stockModelValidator = new StockModelValidator();

    }

    @Test
    public void validateModelInvalidNameTest() throws ApiBadRequestException {
        exception.expect(ApiBadRequestException.class);
        stockModelValidator.validateSaveStockModel(new StockModel("", 120.9));
    }

    @Test
    public void validateModelInvalidPriceTest() throws ApiBadRequestException {
        exception.expect(ApiBadRequestException.class);
        stockModelValidator.validateSaveStockModel(new StockModel("RB", null));
    }
}
