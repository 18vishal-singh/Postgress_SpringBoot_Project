package paper.dao;

import org.springframework.data.repository.CrudRepository;

import paper.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
