package tn.zelda.projects.microservice.ordermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.zelda.projects.microservice.ordermicroservice.domain.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
