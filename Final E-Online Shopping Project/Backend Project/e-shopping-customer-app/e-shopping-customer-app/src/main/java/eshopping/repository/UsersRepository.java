package eshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eshopping.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, String>{

}
