package tn.zelda.samples.spring.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.zelda.samples.spring.tdd.business.ProductsBusinessImpl;
import tn.zelda.samples.spring.tdd.entities.Product;
import tn.zelda.samples.spring.tdd.repositories.ProductsRepository;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductBusinessTest {

    @InjectMocks
    ProductsBusinessImpl productsBusiness;

    @Mock
    ProductsRepository productsRepository;

    @Test
    public void getProductsTestOk() {
        when(productsRepository.getAll()).thenReturn(Arrays.asList(new Product()));
       assertEquals( 0, productsBusiness.getProducts().get(0).getId());
    }

}
