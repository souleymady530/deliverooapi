package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.LivreurSocietes;


@Repository

public interface LivreurSocieteRepository extends CrudRepository<LivreurSocietes,Long>{

}
