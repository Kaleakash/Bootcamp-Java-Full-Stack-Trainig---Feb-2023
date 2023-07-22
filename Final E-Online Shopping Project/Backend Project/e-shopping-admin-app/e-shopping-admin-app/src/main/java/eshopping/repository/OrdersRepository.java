package eshopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eshopping.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	// SQL 
@Query(value="select o.*, p.* from Orders o, product p, productsOrdersInfo poi where p.pid =poi.pid and o.orderid = poi.oid and o.email = :emailid",nativeQuery = true)
	public List<Object> viewByOrdersByCustomer(@Param("emailid") String emailid);
	// SQL 

@Query(value = "select o.*, p.* from Orders o, product p, productsOrdersInfo poi where p.pid =poi.pid and o.orderid = poi.oid;",nativeQuery = true)
public List<Object[]> getAllOrdersInfo();



}
