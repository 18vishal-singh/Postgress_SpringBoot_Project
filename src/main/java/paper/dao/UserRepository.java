package paper.dao;

import org.springframework.data.repository.CrudRepository;

import paper.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
