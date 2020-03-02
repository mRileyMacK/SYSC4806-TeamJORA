package Application;
import java.util.List;
import Model.Group;
import org.springframework.data.repository.CrudRepository;


public interface GroupRepository extends CrudRepository<Group, Long> {
    List<Group> findByName(String name);
}
