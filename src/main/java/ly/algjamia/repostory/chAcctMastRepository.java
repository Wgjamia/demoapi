package ly.algjamia.repostory;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import ly.algjamia.model.chAcctMast;


@Repository
public interface chAcctMastRepository extends CrudRepository<chAcctMast,Long> {}