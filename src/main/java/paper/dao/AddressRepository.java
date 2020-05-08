package paper.dao;

import org.springframework.data.repository.CrudRepository;

import paper.model.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
