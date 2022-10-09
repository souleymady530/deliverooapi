package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.Livreur;


@Repository

public interface LivreurRepository extends CrudRepository<Livreur,Long>{

}
