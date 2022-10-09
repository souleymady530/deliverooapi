package MAIN.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import MAIN.Models.DelivreRoom;


@Repository

public interface DelivreRoomRepository extends CrudRepository<DelivreRoom,Long>{

}
