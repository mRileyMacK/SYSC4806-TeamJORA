package Application;
import java.util.List;

import Model.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long>{
    List<Instructor> findByName(String name);
}
