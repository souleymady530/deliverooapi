package Main.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="DelivreRoom")
public class DelivreRoom 
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String pays;
	private int indicatif;
	private int tel1;
	private int tel2;
	private String dateOuverture;
	
	@Override
	public String toString() {
		return "DelivreRoom [id=" + id + ", pays=" + pays + ", indicatif=" + indicatif + ", tel1=" + tel1 + ", tel2="
				+ tel2 + ", dateOuverture=" + dateOuverture + "]";
	}
	
}
