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

import MAIN.Models.Livreur;
import MAIN.Services.LivreurService;

@RestController
public class LivreurController {

	@Autowired
	private LivreurService livreurService;
	
	@GetMapping("/Livreurs")
	public Iterable<Livreur> getLivreurs()
	{
		return livreurService.getLivreurs();
	}
	
	@GetMapping("Livreur/{id}")
	public Optional<Livreur> getLivreur(@PathVariable("id") final long id)
	{
		return livreurService.getLivreur(id);
	}
	
	@PostMapping("/Livreur/save")
	public String saveLivreur(@RequestBody Livreur livreur)
	{
		return livreurService.saveLivreur(livreur);
	}
	
	@PutMapping("/Livreur/{id}")
	public String updateLivreur(@PathVariable("id") final Long id, @RequestBody Livreur livreur)
	{
		return livreurService.updateLivreur(id, livreur);
	}
	
	@DeleteMapping("/Livreur/{id}")
	public String deleteLivreur(@PathVariable("id") final Long id)
	{
		return livreurService.deleteLivreur(id);
	}
}
