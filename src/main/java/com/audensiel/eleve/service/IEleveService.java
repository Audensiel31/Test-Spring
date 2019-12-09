package com.audensiel.eleve.service;

import java.util.List;

import com.audensiel.eleve.domain.Eleve;

public interface IEleveService {

	public List<Eleve> getListeEleve();
	public Eleve getMeilleurEleveParMatiere(String matiere);
	public Eleve getMeilleurEleve();
	public String getSyntheseEleveClasse();
}
