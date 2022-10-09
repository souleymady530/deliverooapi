package Main.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Main.Models.LivreurPersonnes;
import Main.Repositories.LivreurPersonneRepository;

@Service
public class LivreurPersonneService {

	@Autowired
	private LivreurPersonneRepository lRepos;
	
	//get ena record identified by id s field
	public Optional<LivreurPersonnes> getLivreurPersonne(final Long id)
	{
		return lRepos.findById(id);
	}
	
	public Iterable<LivreurPersonnes> getLivreurPersonnes()
	{
		return lRepos.findAll();
	}
	
	public String deleteLivreurPersonne(final Long id)
	{
		String result="Record deleted";
		lRepos.deleteById(id);;
		return result;
	}
	
	
	public String saveLivreurPersonne(LivreurPersonnes livreur)
	{
		String result="Record Saved";
		//Write code to control field of livreur
		return result;
	}
	
	public String updateLivreurPersonne(final Long id,LivreurPersonnes livreur)
	{
		String result="Record updated";
		//Write code to control field of livreur
		return result;
	}
	
	
	
}
