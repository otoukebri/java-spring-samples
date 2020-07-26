package tn.zelda.projects.spring.stock.service;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import tn.zelda.projects.spring.stockservice.business.StockBusinessImpl;
import tn.zelda.projects.spring.stockservice.dao.StockRepository;
import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;
import tn.zelda.projects.spring.stockservice.model.StockModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class StockServiceTest {

    @InjectMocks
    StockBusinessImpl stockBusiness;

    @MockBean
    StockRepository stockRepository;

    @Before
    public void setUp() {

        StockEntity stock  = new StockEntity("A", 100.0, new Date());
        stock.setId(1L);
        Mockito.when(stockRepository.findOne(1L)).thenReturn(stock);

        StockEntity stock2  = new StockEntity("B", 500.00, new Date());
        Mockito.when(stockRepository.save(stock2)).thenReturn(stock2);

        StockEntity stock3  = new StockEntity("C", 500.00, new Date());
        Mockito.when(stockRepository.save(stock)).thenReturn(new StockEntity("C",199.00, new Date()));
        List<StockEntity> stocks = new ArrayList<StockEntity>();
        stocks.add(stock);
        stocks.add(stock2);
        PageRequest pageable = new PageRequest(0, 50);

        Page p = new Page() {
            @Override
            public int getTotalPages() {
                return 0;
            }

            @Override
            public long getTotalElements() {
                return 0;
            }

            @Override
            public Page map(Converter converter) {
                return null;
            }

            @Override
            public int getNumber() {
                return 0;
            }

            @Override
            public int getSize() {
                return stocks.size();
            }

            @Override
            public int getNumberOfElements() {
                return 0;
            }

            @Override
            public List getContent() {
                return stocks;
            }

            @Override
            public boolean hasContent() {
                return false;
            }

            @Override
            public Sort getSort() {
                return null;
            }

            @Override
            public boolean isFirst() {
                return false;
            }

            @Override
            public boolean isLast() {
                return false;
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Pageable nextPageable() {
                return null;
            }

            @Override
            public Pageable previousPageable() {
                return null;
            }

            @Override
            public Iterator iterator() {
                return null;
            }
        };

        Mockito.when(stockRepository.findAll(pageable)).thenReturn(p);
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void getStockTest(){
        StockModel stockModel = stockBusiness.getStock(1);
        assertEquals(stockModel.getName(),"A");
        assertEquals(stockModel.getCurrentPrice(),new Double(100.0));
    }


    @Test
    public void saveStockTest(){
        StockModel stockModel = stockBusiness.saveStock(new StockModel("B", 500.00));
        assertEquals(stockModel.getName(),"B");
        assertEquals(stockModel.getCurrentPrice(),new Double(500.00));
    }

    @Test
    public void updateStockTest(){
        StockModel stockModel = stockBusiness.updateStock(new StockModel("A", 100.),1);
        assertEquals(stockModel.getName(),"C");
        assertEquals(stockModel.getCurrentPrice(),new Double(199.00));
    }

    @Test
    public void getAllStocks(){
        List<StockModel> stocks = stockBusiness.getAllStocks(0);
        assertEquals(stocks.size(), 2);
   }
}
