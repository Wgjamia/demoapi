package ly.algjamia.repostory;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import ly.algjamia.model.acctTransaction;


@Repository
public interface AcctTransactinsRepository extends CrudRepository<acctTransaction,Long> {}