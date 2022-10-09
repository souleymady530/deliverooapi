package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.Personne;


@Repository

public interface PersonneRepository extends CrudRepository<Personne,Long>{

}
