package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.LivreurPersonnes;


@Repository

public interface LivreurPersonneRepository extends CrudRepository<LivreurPersonnes,Long>{

}
