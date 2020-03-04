package Repository;
import java.util.List;
import Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Student", path = "Student")
public interface StudentRepository extends CrudRepository<Student, Long>{
    List<Student> findByName(String name);
    List<Student> findAll();
    Student findById(long id);
}
