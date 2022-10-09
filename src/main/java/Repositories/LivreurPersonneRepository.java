package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.LivreurPersonnes;


@Repository

public interface LivreurPersonneRepository extends CrudRepository<LivreurPersonnes,Long>{

}
