package MAIN.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MAIN.Models.LivreurSocietes;
import MAIN.Repositories.LivreurSocieteRepository;

@Service
public class LivreurSocietesService {

	@Autowired
	private LivreurSocieteRepository lRepos;
	
	//get entity identified by id
	public Optional <LivreurSocietes>getLivreurSociete(final Long id)
	{
		return lRepos.findById(id);
	}
	
	//get all entities of the table
	public Iterable <LivreurSocietes> getLivreurSocietes()
	{
		return lRepos.findAll();
	}
	
	//delete entity identified by id s field
	public String deleteLivreurSociete(final Long id)
	{
		String result="entity deleted";
		lRepos.deleteById(id);
		return result;
	}
	
	//save entity 
	public String saveLivreurSociete(LivreurSocietes livreur)
	{
		String result="Entity saved";
		//write here code to control fields
		return result;
	}
	
	
	//Update entity identified by id s field
	public String updateLivreurSociete(final Long id,LivreurSocietes livreur)
	{
		String result="Entity saved";
		//write here code to control fields
		return result;
	}
	
	
	
}
