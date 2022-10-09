package Main.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Livreur")
public class Livreur
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String pays;
	private String ville;
	private String indicatif;
	private String tel1;
	private String tel2;
	
	@Override
	public String toString() {
		return "Livreur [id=" + id + ", pays=" + pays + ", ville=" + ville + ", indicatif=" + indicatif + ", tel1="
				+ tel1 + ", tel2=" + tel2 + "]";
	}
	
	
}
