package MAIN.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MAIN.Models.Contrats;
import MAIN.Repositories.ContratsRepository;

@Service
public class ContratsService 
{

	@Autowired
	private ContratsRepository cRepos;
	
	//get a record idenfied by id
	public Optional<Contrats> getContrats(final Long id)
	{
		return cRepos.findById(id);
	}
	
	//get all records 
	public Iterable<Contrats> getContrat()
	{
		return cRepos.findAll();
	}
	
	//delete a record identified by Id
	public String deleteContrat(final Long id)
	{
		String result="Record delete";
		cRepos.deleteById(id);;
		return result;
	}
	
	//save a record 
	public String saveContrat(Contrats contrat)
	{
		String result="Record saved";
		//write here code to controls entity fields
		return result;
	}
	
	
	//update a record 
	public String updateContrat(final Long id,Contrats contrat)
	{
		String result="Record saved";
		//write here code to controls entity fields
		return result;
	}
	
	
	
	
}
