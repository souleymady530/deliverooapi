package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.Contrats;


@Repository

public interface ContratsRepository extends CrudRepository<Contrats,Long>{

}
