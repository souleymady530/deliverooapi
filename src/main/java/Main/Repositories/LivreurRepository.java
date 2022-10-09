package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.Livreur;


@Repository

public interface LivreurRepository extends CrudRepository<Livreur,Long>{

}
