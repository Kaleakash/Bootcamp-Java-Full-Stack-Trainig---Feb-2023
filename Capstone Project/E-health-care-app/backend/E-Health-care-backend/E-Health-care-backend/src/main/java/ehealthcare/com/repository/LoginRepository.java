package ehealthcare.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ehealthcare.com.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{

}
