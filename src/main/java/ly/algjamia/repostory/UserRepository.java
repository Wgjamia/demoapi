package ly.algjamia.repostory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ly.algjamia.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}