package com.deliverooapi.src.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="LivreurPersonnes")
public class LivreurPersonnes 
{
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int idPersonne;
	
	@Override
	public String toString() {
		return "LivreurPersonnes [id=" + id + ", idPersonne=" + idPersonne + "]";
	}
	
	
}
