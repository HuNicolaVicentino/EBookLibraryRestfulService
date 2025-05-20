package Hu_Nicola.EBook_Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//https://www.geeksforgeeks.org/spring-boot-jparepository-with-example/
import java.util.Optional;
public interface recensionetableRepository extends JpaRepository<recensionetable,Integer>{
    recensionetable findBycodicerecensione(int codicerecensione);
    recensionetable findTop1BycodicerecensioneIgnoreCaseOrderByIdtestoDesc(); 






}
