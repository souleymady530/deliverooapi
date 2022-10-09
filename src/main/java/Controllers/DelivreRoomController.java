package MAIN.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import MAIN.Models.DelivreRoom;
import MAIN.Services.DelivreRoomService;

@RestController
public class DelivreRoomController
{

	@Autowired
	private DelivreRoomService dService;
	
	
	@GetMapping("/DelivreRooms")
	public Iterable<DelivreRoom> getDelivreRooms()
	{
		return dService.getDelivreRooms();
		
	}
	
	@PostMapping("/DelivreRoom/save")
	public String createDelivreRoom(@RequestBody DelivreRoom delivreRoom)
	{
		return dService.saveDelivreRoom(delivreRoom);
	}
	
	@GetMapping("DelivreRoom/{id}")
	public Optional <DelivreRoom> getDelivreRoom(@PathVariable("id") final Long id)
	{
		return dService.getDelivreRoom(id);
	}
	
	
	@PutMapping("/DelivreRoom/{id}")
	public String updateDelivreRoom(@PathVariable("id") final Long id, @RequestBody DelivreRoom delivreRoom)
	{
		return dService.updateDelivreRoom(id, delivreRoom);
	}
	
	@DeleteMapping("/DelivreRoom/{id}")
	public String deleteDelivreRoom(@PathVariable("id") final Long id)
	{
		return dService.deleteDelivreRoom(id);
	}
}
