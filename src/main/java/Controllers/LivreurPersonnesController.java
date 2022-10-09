package MAIN.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import MAIN.Models.LivreurPersonnes;
import MAIN.Services.LivreurPersonneService;

public class LivreurPersonnesController {

	@Autowired
	private LivreurPersonneService livreurPService;
	
	@GetMapping("/LivreurPersonnes")
	public Iterable<LivreurPersonnes> getLivreurPersonne()
	{
		return livreurPService.getLivreurPersonnes();
				
	}
	
	@GetMapping("LivreurPersonnes/{id}")
	public Optional<LivreurPersonnes> getLivreurPersonne(@PathVariable("id") final long id)
	{
		return livreurPService.getLivreurPersonne(id);
	}
	
	@PostMapping("/LivreurPersonnes/save")
	public String saveLivreurPersonne(@RequestBody LivreurPersonnes livreur)
	{
		return livreurPService.saveLivreurPersonne(livreur);
	}
	
	@PutMapping("/LivreurPersonnes/{id}")
	public String updateLivreurPersonne(@PathVariable("id") final Long id, @RequestBody LivreurPersonnes livreur)
	{
		return livreurPService.updateLivreurPersonne(id, livreur);
	}
	
	@DeleteMapping("/LivreurPersonnes/{id}")
	public String deleteLivreurPersonne(@PathVariable("id") final Long id)
	{
		return livreurPService.deleteLivreurPersonne(id);
	}
}
