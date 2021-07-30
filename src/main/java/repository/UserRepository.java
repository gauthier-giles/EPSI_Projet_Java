package repository;

import database.Pc;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository <Pc,String> {

}
