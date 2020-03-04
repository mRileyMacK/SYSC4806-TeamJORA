package Repository;
import java.util.List;
import Model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Group", path = "Group")
public interface GroupRepository extends CrudRepository<Group, Long> {
    List<Group> findByName(String name);
    List<Group> findAll();
    Group findById(long id);
}
