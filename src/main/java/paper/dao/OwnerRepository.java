package paper.dao;

import org.springframework.data.repository.CrudRepository;

import paper.model.Owner;


public interface OwnerRepository extends CrudRepository<Owner, Integer> {

}
