package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.Contrats;


@Repository

public interface ContratsRepository extends CrudRepository<Contrats,Long>{

}
