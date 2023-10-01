package ehealthcare.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ehealthcare.com.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

}
