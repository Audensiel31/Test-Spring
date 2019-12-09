package com.audensiel.eleve;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.audensiel.eleve.domain.Eleve;
import com.audensiel.eleve.domain.Note;
import com.audensiel.eleve.service.IEleveService;

@SpringBootTest
class EleveApplicationTests {

	@Autowired
	private IEleveService eleveService;
	
	@Test
	void testMeilleurEleve() {
		List<Note> notesEleve1 = new ArrayList<>();
		notesEleve1.add(new Note("Klingon", 12.5));
		notesEleve1.add(new Note("Java", 18.0));
		notesEleve1.add(new Note("JUnit", 19.0));

		Eleve eleve1 = new Eleve(null, "Haddock", "Capitaine", notesEleve1);
		
		List<Note> notesEleve2 = new ArrayList<>();
		notesEleve2.add(new Note("Klingon", 10.0));
		notesEleve2.add(new Note("Java", 1.0));
		notesEleve2.add(new Note("JUnit", 11.0));

		Eleve eleve2 = new Eleve(null, "Mac Calloway", "Peter", notesEleve2);
		
		List<Note> notesEleve3 = new ArrayList<>();
		notesEleve3.add(new Note("Klingon", 14.5));
		notesEleve3.add(new Note("Java", 10.0));
		notesEleve3.add(new Note("JUnit", 9.0));

		Eleve eleve3 = new Eleve(null, "Fett", "Boba", notesEleve3);
		// TODO sauvegarder les élèves en bd
		assertEquals(eleve1, this.eleveService.getMeilleurEleve());
	}
	
	@Test
	void testMeilleurEleveKlingon() {
		List<Note> notesEleve1 = new ArrayList<>();
		notesEleve1.add(new Note("Klingon", 12.5));
		notesEleve1.add(new Note("Java", 18.0));
		notesEleve1.add(new Note("JUnit", 19.0));

		Eleve eleve1 = new Eleve(null, "Haddock", "Capitaine", notesEleve1);
		
		List<Note> notesEleve2 = new ArrayList<>();
		notesEleve2.add(new Note("Klingon", 10.0));
		notesEleve2.add(new Note("Java", 1.0));
		notesEleve2.add(new Note("JUnit", 11.0));

		Eleve eleve2 = new Eleve(null, "Mac Calloway", "Peter", notesEleve2);
		
		List<Note> notesEleve3 = new ArrayList<>();
		notesEleve3.add(new Note("Klingon", 14.5));
		notesEleve3.add(new Note("Java", 10.0));
		notesEleve3.add(new Note("JUnit", 9.0));

		Eleve eleve3 = new Eleve(null, "Fett", "Boba", notesEleve3);
		// TODO sauvegarder les élèves en bd
		assertEquals(eleve3, this.eleveService.getMeilleurEleveParMatiere("klingon"));
	}

}
