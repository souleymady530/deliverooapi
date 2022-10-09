package MAIN.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MAIN.Models.Colis;
import MAIN.Repositories.ColisRepository;

@Service
public class ColisService 
{

	@Autowired
	private ColisRepository cRepos;
	
	//get record identified by id;
	public Optional  <Colis> getColis(final Long id)
	{
		return cRepos.findById(id);
	}
	
	//Get all records
	public Iterable<Colis> getColis()
	{
		return cRepos.findAll();
	}
	
	
	//Delete a record identfied by id
	public String deleteColis(final Long id)
	{
		String result="Record deleted";
		cRepos.deleteById(id);
		return result;
	}
	
	//Save a record
	public String saveColis(Colis colis)
	{
		String result="Record save";
		
		//Write code to control enntity field
		return result;
	}
	
	
	//Update a record
		public String updateColis(final Long id,Colis colis)
		{
			String result="Record update";
			
			//Write code to control enntity field
			return result;
		}
		
	
	
}
