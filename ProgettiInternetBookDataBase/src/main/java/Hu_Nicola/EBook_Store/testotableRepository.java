package Hu_Nicola.EBook_Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//https://www.geeksforgeeks.org/spring-boot-jparepository-with-example/
import java.util.Optional;
public interface testotableRepository extends JpaRepository<testotable,Integer>{
    testotable[] findTop10ByOrderByIdtestoDesc();
    testotable[] findTop10ByGeneretestoIgnoreCaseOrderByIdtestoDesc(String generetesto); 
    testotable findBytitolotesto(String titolotesto);
    testotable[] findByIdtesto(int idtesto);





}
