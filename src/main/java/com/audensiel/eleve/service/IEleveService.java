package com.audensiel.eleve.service;

import java.util.List;

import com.audensiel.eleve.domain.Eleve;

public interface IEleveService {

	/**
	 * Liste de tout les élèves en bdd
	 */
	public List<Eleve> getListeEleve();
	/**
	 * Meilleur élève d'une matière
	 */
	public Eleve getMeilleurEleveParMatiere(String matiere);
	/**
	 * Meilleur élève toute matière cofondue
	 */
	public Eleve getMeilleurEleve();
	/**
	 * Synthèse des élèves de la classe sous la forme: 
	 * Eleve : {Nom} {Prenom} {Moyenne} {Classement}
	 */
	public String getSyntheseEleveClasse();
}
