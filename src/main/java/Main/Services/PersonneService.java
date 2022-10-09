package Main.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Main.Models.Personne;
import Main.Repositories.PersonneRepository;

@Service
public class PersonneService 
{
	@Autowired
	private PersonneRepository pRepos;
	
	//return an unique entity identified by fields id of the table
	public Optional<Personne> getPersonne(final Long id)
	{
		return pRepos.findById(id);
	}
	
	
	//return all entity 
	public Iterable<Personne> getPersonnes()
	{
		return pRepos.findAll();
	}
	
	//delete entity idendified by field id in the table
	public String deletePersonne(final Long id)
	{
		String result="Entity deleted";
		pRepos.deleteById(id);
		return result;
	}
	
	///////////////////////////////////////////////////to write
	//save entity
	public String savePersonne(Personne personne)
	{
		String result="Entity saved";
		
		return result;
	}
	//update entity
	public String updatePersonne(final Long id,Personne personne)
	{
		String result="Entity update";
		
		return result;
	}
}
