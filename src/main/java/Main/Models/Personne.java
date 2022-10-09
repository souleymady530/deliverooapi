package Main.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Personnes")
public class Personne 
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String prenom;
	private String genre;
	private String typeIdentifiant;
	private String referenceIdentifiant;
	private String email;
	private String motDePasse;
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", typeIdentifiant="
				+ typeIdentifiant + ", referenceIdentifiant=" + referenceIdentifiant + ", email=" + email
				+ ", motDePasse=" + motDePasse + "]";
	}
	
	/*
	 * id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,nom VARCHAR(50),
	 * prenom VARCHAR(100),genre VARCHAR(20),
	 * typeIdentifiant VARCHAR(10),referenceIdentifiant VARCHAR(50),
	 * email VARCHAR(100),motDePasse VARCHAR(100)
	 * 
	 */
}
