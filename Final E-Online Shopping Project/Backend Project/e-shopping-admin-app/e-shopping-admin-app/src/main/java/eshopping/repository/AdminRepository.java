package eshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eshopping.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String>{

}
