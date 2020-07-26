package tn.zelda.repository;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;
import tn.zelda.domain.Product;

@Repository
public interface ProductRepository extends ElasticsearchCrudRepository<Product, Long> {
    Product getByCode(String code);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"products.code\": \"?0\"}}]}}")
    Product getByCode2(String code);
}
