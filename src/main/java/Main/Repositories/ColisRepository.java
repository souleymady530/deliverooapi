package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.Colis;


@Repository
public interface ColisRepository extends CrudRepository<Colis,Long>{

}
