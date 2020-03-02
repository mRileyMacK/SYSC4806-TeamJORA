package Application;


import java.util.List;
import Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findByName(String name);
}
