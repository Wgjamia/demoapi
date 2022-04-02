package ly.algjamia.repostory;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ly.algjamia.model.AcctStates;



@Repository
public interface AcctStatesRepository extends CrudRepository<AcctStates,Long> {}