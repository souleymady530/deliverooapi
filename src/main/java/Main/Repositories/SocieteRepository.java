package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.Societes;


@Repository

public interface SocieteRepository extends CrudRepository<Societes,Long>{

}
