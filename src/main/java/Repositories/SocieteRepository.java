package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.Societes;


@Repository

public interface SocieteRepository extends CrudRepository<Societes,Long>{

}
