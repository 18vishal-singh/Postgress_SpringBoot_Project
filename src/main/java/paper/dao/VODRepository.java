package paper.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import paper.model.VOD;

public interface VODRepository extends CrudRepository<VOD, Integer> {
	
	/*
	 * @Query("SELECT title FROM VOD v WHERE v.title LIKE ?1") public List<VOD>
	 * findByName(String name);
	 */

}
