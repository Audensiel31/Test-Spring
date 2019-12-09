package com.audensiel.eleve.domain;

import java.util.List;

public class Eleve {

	private long id;
	private String nom;
	private String prenom;
	private List<Note> notes;
	
	public Eleve(Long id, String nom, String prenom, List<Note> notes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.notes = notes;
	}
	
	
}
