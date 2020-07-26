package tn.zelda.projects.microservice.ordermicroservice;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.zelda.projects.microservice.ordermicroservice.dao.OrderRepository;
import tn.zelda.projects.microservice.ordermicroservice.dao.ProductRepository;
import tn.zelda.projects.microservice.ordermicroservice.domain.Order;
import tn.zelda.projects.microservice.ordermicroservice.domain.OrderDetail;
import tn.zelda.projects.microservice.ordermicroservice.domain.Product;

@SpringBootApplication
public class RestApiOrdersApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(RestApiOrdersApplication.class);

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestApiOrdersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.debug("OrderMicroservice command line runner!");

		Product product = new Product("Microservices", "ms_ebook", 50);

		productRepository.save(product);

		Order o = new Order();

		Set<OrderDetail> odSet = o.getOrdersDetails();
		System.out.println(odSet);
		odSet.add(new OrderDetail(product, o));
		try {
			orderRepository.save(o);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
