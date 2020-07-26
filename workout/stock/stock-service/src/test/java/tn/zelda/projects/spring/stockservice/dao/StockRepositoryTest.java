package tn.zelda.projects.spring.stockservice.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import tn.zelda.projects.spring.stockservice.dao.StockRepository;
import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StockRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private StockRepository stockRepository;

    @Test
    public void findByNameTest(){
        StockEntity stockToInsert  = new StockEntity("A", 100.0, new Date());
        entityManager.persist(stockToInsert);
        entityManager.flush();
        StockEntity stockEntity = stockRepository.findByName("A");
        assertEquals(stockEntity.getName(),stockToInsert.getName());

    }

}
