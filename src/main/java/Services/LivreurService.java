package MAIN.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MAIN.Models.Livreur;
import MAIN.Repositories.LivreurRepository;

@Service
public class LivreurService {

	@Autowired
	private LivreurRepository lRepos;
	
	
	//get a record identified by id
	public Optional <Livreur> getLivreur(final Long id)
	{
		return lRepos.findById(id);
	}
	
	//get all record
	public Iterable<Livreur> getLivreurs()
	{
		return lRepos.findAll();
		
	}
	
	
	//delete record identified by id
	public String deleteLivreur(final Long id)
	{
		String result="Record deleted";
		lRepos.deleteById(id);
		return result;
	}
	
	//save record
	public String saveLivreur(Livreur lv)
	{
		String result="Record Saved";
		//write code here
		return result;
	}
	
	//update record
		public String updateLivreur(final Long id,Livreur lv)
		{
			String result="Record Updated";
			//write code here
			return result;
		}
	
	
}
