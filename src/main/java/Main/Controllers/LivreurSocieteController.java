package Main.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Main.Models.LivreurSocietes;
import Main.Services.LivreurSocietesService;

public class LivreurSocieteController {

	@Autowired
	private LivreurSocietesService livreurSocieteService;
	
	@GetMapping("/LivreurSociete")
	public Iterable<LivreurSocietes> getLivreurSocietes()
	{
		return livreurSocieteService.getLivreurSocietes();
	}
	
	@GetMapping("LivreurSociete/{id}")
	public Optional<LivreurSocietes> getLivreurSociete(@PathVariable("id") final long id)
	{
		return livreurSocieteService.getLivreurSociete(id);
	}
	
	@PostMapping("/LivreurSociete/save")
	public String saveLivreurSociete(@RequestBody LivreurSocietes livreur)
	{
		return livreurSocieteService.saveLivreurSociete(livreur);
	}
	
	@PutMapping("/LivreurSociete/{id}")
	public String updateLivreurSociete(@PathVariable("id") final Long id, @RequestBody LivreurSocietes livreur)
	{
		return livreurSocieteService.updateLivreurSociete(id, livreur);
	}
	
	@DeleteMapping("/LivreurSociete/{id}")
	public String deleteLivreurSociete(@PathVariable("id") final Long id)
	{
		return livreurSocieteService.deleteLivreurSociete(id);
	}
}
