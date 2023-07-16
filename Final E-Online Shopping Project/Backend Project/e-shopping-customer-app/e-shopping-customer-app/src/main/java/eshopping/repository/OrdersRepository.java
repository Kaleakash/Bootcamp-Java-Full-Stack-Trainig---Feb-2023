package eshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eshopping.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
