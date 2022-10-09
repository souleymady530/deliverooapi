package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.Colis;


@Repository
public interface ColisRepository extends CrudRepository<Colis,Long>{

}
