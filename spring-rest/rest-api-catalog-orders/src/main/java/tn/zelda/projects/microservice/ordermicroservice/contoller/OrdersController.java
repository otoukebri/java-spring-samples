package tn.zelda.projects.microservice.ordermicroservice.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.zelda.projects.microservice.ordermicroservice.dao.OrderRepository;
import tn.zelda.projects.microservice.ordermicroservice.domain.Order;

@RestController(value="/")
public class OrdersController {
	
	@Autowired
	private OrderRepository ordersRepository;
	
	@RequestMapping(value= "/", method = RequestMethod.GET, produces = "application/json")
		public List<Order> getAllOrders() {
		return ordersRepository.findAll();
	}
	
	
	// create order
/**
	@PostMapping(
	        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	) 	
 */
	
	
	
}
