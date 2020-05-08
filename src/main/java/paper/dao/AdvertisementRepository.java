package paper.dao;

import org.springframework.data.repository.CrudRepository;

import paper.model.Advertisement;

public interface AdvertisementRepository extends CrudRepository<Advertisement, Integer> {

}
