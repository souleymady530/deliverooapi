package Main.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Societes")
public class Societes {

	private Long id;
	private String pays;
	private String ville;
	private String ifu;
	private String rccm;
	private String dateCreation;
	private String nomresponsable;
	private String prenomReponsable;
	private String typeIdentifiant;
	private String referencesIdentifiant;
	@Override
	public String toString() {
		return "Societes [id=" + id + ", pays=" + pays + ", ville=" + ville + ", ifu=" + ifu + ", rccm=" + rccm
				+ ", dateCreation=" + dateCreation + ", nomresponsable=" + nomresponsable + ", prenomReponsable="
				+ prenomReponsable + ", typeIdentifiant=" + typeIdentifiant + ", referencesIdentifiant="
				+ referencesIdentifiant + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	/*
	 * Societes(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	 * pays VARCHAR(50),Ville VARCHAR(50),ifu VARCHAR(50),
	 * rccm VARCHAR(50),dateCreation VARCHAR(20),nomResponsable VARCHAR(30),prenomResponsable VARCHAR(100),
	 * typeIdentifiant VARCHAR(20),referencesIdentifiant VARCHAR(50));
	 */
}
