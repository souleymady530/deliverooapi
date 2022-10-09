package com.deliverooapi.src.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Colis")
public class Colis 
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	private String typeColis;
	private String prixColis;
	@Override
	public String toString() {
		return "Colis [id=" + id + ", typeColis=" + typeColis + ", prixColis=" + prixColis + "]";
	}
	
	
}
