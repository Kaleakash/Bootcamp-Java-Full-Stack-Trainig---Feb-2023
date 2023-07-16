package eshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eshopping.entity.ProductOrdersInfo;

@Repository
public interface ProductOrdersInfoRepository extends JpaRepository<ProductOrdersInfo, Integer>{

}
