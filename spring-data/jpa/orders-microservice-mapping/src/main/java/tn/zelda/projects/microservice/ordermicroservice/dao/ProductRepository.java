package tn.zelda.projects.microservice.ordermicroservice.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.OrderBy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.zelda.projects.microservice.ordermicroservice.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@OrderBy("price DESC")
	@Query("SELECT p FROM Product p")
	public List<Product> getProductsOrdredByPrice();

	public Optional<Product> findProductById(Long id);

	public Optional<Product> getProductByCode(String code);
}
