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

import MAIN.Models.Colis;
import MAIN.Services.ColisService;

@RestController
public class ColisController 
{

	@Autowired
	private ColisService colisService;
	
	
	@GetMapping("/Colis")
	public Iterable<Colis> getColis()
	{
		return colisService.getColis();
	}
	
	@GetMapping("/Colis/{id}")
	public Optional<Colis> getColis(@PathVariable("id") final Long id)
	{
		return colisService.getColis(id);
	}
	
	@PostMapping("/Colis/save")
	public String saveColis(@RequestBody Colis colis)
	{
		return colisService.saveColis(colis);
	}
	
	@PutMapping("/Colis/{id}")
	public String updateColis(@PathVariable("id") final Long id,@RequestBody Colis colis)
	{
		return colisService.updateColis(id, colis);
	}
	
	@DeleteMapping("/Colis/{id}")
	public String deleteColis(@PathVariable("id") final Long id)
	{
		return colisService.deleteColis(id);
	}
}
