package paper.dao;

import org.springframework.data.repository.CrudRepository;

import paper.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Integer> {

}
