package MAIN.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import MAIN.Models.Societes;
import MAIN.Repositories.SocieteRepository;

@Service
public class SocietesService 
{
	@Autowired
	private SocieteRepository sRepos;
	
	
	//Return an unique entity identified by id
	public Optional<Societes> getSociete(final Long id)
	{
		return sRepos.findById(id);
	}
	
	//Return all entities
	public Iterable<Societes> getSocietes()
	{
		return sRepos.findAll();
	}
	
	
	//Delete an entity identified by id
	public String deleteSociete(final Long id)
	{
		String result="Entity Deleted";
		sRepos.deleteById(id);
		return result;
	}
	
	
	//save an entity
	public String saveSociete(Societes soc)
	{
		//write all controls of Societes fields.
		String result="Entity saved";
		
		return result;
	}
	
	
	public String updateSociete(final Long id,Societes soc)
	{
		String result="Entity Not Updaye";
		
		//Witre all controls of Societes fields for update
		return result;
	}

	
	
}
