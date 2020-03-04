package Model;
import java.util.List;

import Model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "groups", path = "groups")
public interface GroupRepository extends CrudRepository<Group, Long> {
    List<Group> findByName(String name);
    List<Group> findAll();
    Group findById(long id);
}
