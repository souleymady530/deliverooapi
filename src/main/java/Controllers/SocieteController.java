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

import MAIN.Models.Societes;
import MAIN.Services.SocietesService;

@RestController
public class SocieteController
{
	@Autowired
	private SocietesService societeService;
	
	@GetMapping("/Societes")
	public Iterable<Societes> getSocietes()
	{
		return societeService.getSocietes();
				
	}
	
	@GetMapping("/Societe/{id}")
	public Optional <Societes> getSociete(@PathVariable("id") final Long id)
	{
		return societeService.getSociete(id);
	}
	
	@PostMapping("/Societe")
	public String saveSociete(@RequestBody Societes soc)
	{
		return societeService.saveSociete(soc);
	}
	
	@PutMapping("/Societe/{id}")
	public String updateSociete(@PathVariable("id") final long id, @RequestBody Societes soc)
	{
		return societeService.updateSociete(id, soc);
	}
	
	@DeleteMapping("/Societe/{id}")
	public String deleteSociete(@PathVariable("id") final Long id)
	{
		return societeService.deleteSociete(id);
	}
}
