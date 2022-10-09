package Main.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Main.Models.Contrats;
import Main.Services.ContratsService;

@RestController
public class ContratsController 
{

	@Autowired
	private ContratsService contratService;
	
	@GetMapping("/Contrats")
	public Iterable<Contrats> getContrats()
	{
		return contratService.getContrat();
				
	}
	
	@GetMapping("/Contrats/{id}")
	public Optional<Contrats> getContrat(@PathVariable("id") final Long id)
	{
		return contratService.getContrats(id);
	}
	
	@PostMapping("/Contrat/save")
	public String saveContrat(@RequestBody Contrats contrat)
	{
		return contratService.saveContrat(contrat);
	}
	
	@PutMapping("/Contrat/{id}")
	public String updateContrat(@PathVariable("id") final Long id, Contrats contrat)
	{
		return contratService.updateContrat(id, contrat);
	}
	
	@DeleteMapping("/Contrat/{id}")
	public String deleteContrat(final long id)
	{
		return contratService.deleteContrat(id);
	}
	
}
