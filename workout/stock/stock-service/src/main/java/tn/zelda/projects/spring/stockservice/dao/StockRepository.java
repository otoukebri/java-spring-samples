package tn.zelda.projects.spring.stockservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.zelda.projects.spring.stockservice.dao.entities.StockEntity;

@Repository
public interface StockRepository extends  JpaRepository<StockEntity, Long>  {
    @Query("SELECT s FROM StockEntity s WHERE s.name = ?1")
    StockEntity findByName(String name);
}
