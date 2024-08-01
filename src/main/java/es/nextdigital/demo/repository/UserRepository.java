package es.nextdigital.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import es.nextdigital.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	

}

