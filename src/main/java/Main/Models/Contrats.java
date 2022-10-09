package Main.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Contrats")
public class Contrats 
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int idDelivreRoom;
	private String dateSignature;
	
	private int dureeMois;

	@Override
	public String toString() {
		return "Contrats [id=" + id + ", idDelivreRoom=" + idDelivreRoom + ", dateSignature=" + dateSignature
				+ ", dureeMois=" + dureeMois + "]";
	}
	
}
