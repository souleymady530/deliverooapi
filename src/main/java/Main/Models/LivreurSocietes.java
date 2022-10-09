package Main.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="LivreurSocietes")
public class LivreurSocietes 
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int idSociete;
	private int idPersonne;
	
	@Override
	public String toString() {
		return "LivreurSocietes [id=" + id + ", idSociete=" + idSociete + ", idPersonne=" + idPersonne + "]";
	}
	
}
