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

import MAIN.Models.Personne;
import MAIN.Services.PersonneService;

@RestController
public class PersonneController {

	@Autowired
	private PersonneService personneService;
	
	@GetMapping("/Personnes")
	public Iterable<Personne> getPersonnes()
	{
		return personneService.getPersonnes();
		
	}
	
	@GetMapping("/Personne/{id}")
	public Optional<Personne> getPersonne(@PathVariable("id") final Long id)
	{
		return personneService.getPersonne(id);
	}
	
	@PostMapping("/Personne/save")
	public String savePersonne(@RequestBody Personne personne)
	{
		return personneService.savePersonne(personne);
	}
	
	@PutMapping("/Personne/{id}")
	public String updatePersonne(@PathVariable("id") final Long id,@RequestBody Personne personne)
	{
		return personneService.updatePersonne(id, personne);
	}
	
	@DeleteMapping("/Personne/{id}")
	public String deletePersonne(@PathVariable("id") final Long id)
	{
		return personneService.deletePersonne(id);
	}
}
