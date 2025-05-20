package Hu_Nicola.EBook_Store;

import org.springframework.data.jpa.repository.JpaRepository;

//https://www.geeksforgeeks.org/spring-boot-jparepository-with-example/
import java.util.Optional;
public interface usertableRepository extends JpaRepository<usertable,String>{
    Optional<usertable> findByuserName(String userName);

}
