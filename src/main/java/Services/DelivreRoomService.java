package MAIN.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MAIN.Models.DelivreRoom;
import MAIN.Repositories.DelivreRoomRepository;

@Service
public class DelivreRoomService {

	@Autowired
	private DelivreRoomRepository dRepos;
	
	//get record identified by id
	public Optional <DelivreRoom> getDelivreRoom(final Long id)
	{
		return dRepos.findById(id);
	}
	
	//get all record
	public Iterable<DelivreRoom> getDelivreRooms()
	{
		return dRepos.findAll();
	}
	
	public String deleteDelivreRoom(final Long id)
	{
		String result="Record deleted";
		dRepos.deleteById(id);
		return result;
	}
	
	public String saveDelivreRoom(DelivreRoom delivreRoom)
	{
		String result="Record saved";
		//write code here
		return result;
	}
	
	public String updateDelivreRoom(final Long id,DelivreRoom delivreRoom)
	{
		String result="Record updated";
		//write code here
		return result;
	}
	
	
}
