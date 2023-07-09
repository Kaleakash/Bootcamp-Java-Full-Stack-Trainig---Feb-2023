package eshopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import eshopping.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	@Query("select c from Category c where c.categoryName like :categoryName%")
	public List<Category> searchCategoryByName(@Param("categoryName") String categoryName);
}
