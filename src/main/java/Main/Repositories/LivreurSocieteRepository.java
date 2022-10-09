package Main.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Main.Models.LivreurSocietes;


@Repository

public interface LivreurSocieteRepository extends CrudRepository<LivreurSocietes,Long>{

}
