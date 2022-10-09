package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.Personne;


@Repository

public interface PersonneRepository extends CrudRepository<Personne,Long>{

}
