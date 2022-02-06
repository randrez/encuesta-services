/**
 * 
 */
package com.it.encuesta.survey.application.find_all_test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.survey.application.find_all.AllSurvey;
import com.it.encuesta.survey.domain.Survey;
import com.it.encuesta.survey.domain.SurveyRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class AllSurveyTest {
	
	@Mock
	private SurveyRepository repository;
	
	@InjectMocks
	private AllSurvey all;
	
	ArrayList<Survey> surveys;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		surveys = new ArrayList<>();
		surveys.add(newSurvey());
	}
	
	Survey newSurvey() {
		Survey survey = new Survey();
		survey.setId((long) 1);
		survey.setMusicGenreId((long) 1);
		survey.setEmail("taker.andres@gmail.com");
		return survey;
	}
	
	@Test
	void findAll() {
		when(repository.findAll()).thenReturn(surveys);
		assertNotNull(all.allSurvey());
	}

}
