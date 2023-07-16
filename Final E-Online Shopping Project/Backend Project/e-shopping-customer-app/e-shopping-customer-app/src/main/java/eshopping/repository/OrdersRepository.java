package eshopping.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import eshopping.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

	@Query("select o from Orders o where o.email = :emailid")
	public List<Orders> viewByOrders(@Param("emailid") String emailid);
}
