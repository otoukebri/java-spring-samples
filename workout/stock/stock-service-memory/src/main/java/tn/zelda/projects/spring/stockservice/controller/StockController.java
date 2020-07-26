package tn.zelda.projects.spring.stockservice.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.zelda.projects.spring.stockservice.business.StockBusiness;
import tn.zelda.projects.spring.stockservice.exception.ApiBadRequestException;
import tn.zelda.projects.spring.stockservice.exception.ApiConflictException;
import tn.zelda.projects.spring.stockservice.exception.ApiInternalServerException;
import tn.zelda.projects.spring.stockservice.exception.ApiNotFoundException;
import tn.zelda.projects.spring.stockservice.model.StockModel;
import tn.zelda.projects.spring.stockservice.validator.StockModelValidator;

import java.util.List;

@RestController
@RequestMapping(value = "/api/stocks")
public class StockController {

    private static final Logger logger = LoggerFactory.getLogger(StockController.class);

    @Autowired
    private StockBusiness stockBusiness;

    @Autowired
    private StockModelValidator stockModelValidator;

    /**
     * Returns list of all stock using the page passed in argument
     * if no page is passed the first page is taken
     *
     * @return
     */
    @ApiOperation(value = "Get all Stock items within page", notes = "Returns all Stock items within page")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<StockModel>> getAllStocks() {
        logger.debug("StockController.getAllStocks.id");
        return new ResponseEntity<List<StockModel>>(stockBusiness.getAllStocks(), HttpStatus.OK);
    }

    /**
     * Retieves the stock element if exits
     *
     * @param id
     * @return
     */
    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Get a stock item", notes = "Returns the requested Stock item.")
    public ResponseEntity<StockModel> get(@ApiParam(value = "Stock item identifier", required = true)
                                          @PathVariable Long id) throws ApiNotFoundException {
        logger.debug("StockController.get.id: " + id);
        StockModel stockModel = stockBusiness.getStock(id);
        if (stockModel == null) {
            throw new ApiNotFoundException("Unable to find the stock item with id " + id);
        } else {
            return new ResponseEntity<StockModel>(stockModel, HttpStatus.OK);
        }
    }

    /**
     * Updates stockEntity element
     *
     * @param id
     * @param stockModel
     * @return
     */
    @RequestMapping(path = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    @ApiOperation(value = "Updates attributes of tock item.", notes = "Returns the updated stock item")
    public ResponseEntity<StockModel> put(@PathVariable Long id, @RequestBody StockModel stockModel) throws ApiNotFoundException {
        logger.debug("StockController.put: " + stockModel);
        StockModel updateStock = stockBusiness.updateStock(stockModel, id);
        if (updateStock == null) {
            throw new ApiNotFoundException("Unable to find the stockEntity with id " + id);
        } else {
            return new ResponseEntity<StockModel>(updateStock, HttpStatus.OK);
        }
    }


    /**
     * Creates a stockEntity object
     *
     * @param stockModel
     * @return
     */
    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ApiOperation(value = "Creates a new stock item", notes = "Returns the new stock item crated")
    public ResponseEntity<StockModel> post(@RequestBody StockModel stockModel) throws ApiInternalServerException, ApiConflictException, ApiBadRequestException {
        logger.debug("StockController.post: " + stockModel);
        stockModelValidator.validateStockModel(stockModel);
        if (stockBusiness.exist(stockModel)) {
            throw new ApiConflictException("the stock item with name " + stockModel.getName() + " already exists");
        } else {
            StockModel createdStock = stockBusiness.saveStock(stockModel);
            if (createdStock != null) {
                return new ResponseEntity<StockModel>(createdStock, HttpStatus.OK);
            } else {
                throw new ApiInternalServerException("Some thing wrong occurred during create of stock item");
            }
        }
    }


}
