/**
 * 
 */
package com.it.encuesta.survey.infrastructure;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.survey.application.create.SurveyCreator;
import com.it.encuesta.survey.application.find_all.AllSurvey;
import com.it.encuesta.survey.domain.Survey;
import com.it.encuesta.survey.domain.SurveyRepository;
import com.it.encuesta.survey.results.ResultsSurvey;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class SurveyControllerTest {

	@Mock
	private SurveyController controller;

	@Mock
	private SurveyRepository repository;

	@InjectMocks
	private AllSurvey all;

	@InjectMocks
	private SurveyCreator creator;

	@InjectMocks
	private ResultsSurvey allResults;

	private ArrayList<Survey> surveys;
	private ArrayList<Object[]> results;
	private Survey survey;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		createSurvey();
		createListSurvey();
		createResults();
	}

	void createSurvey() {
		survey = new Survey();
		survey.setId((long) 1);
		survey.setMusicGenreId((long) 1);
		survey.setEmail("taker.andres@gmail.com");
	}

	void createListSurvey() {
		surveys = new ArrayList<>();

		Survey survey = new Survey();
		survey.setId((long) 1);
		survey.setMusicGenreId((long) 1);
		survey.setEmail("taker.andres@gmail.com");

		surveys.add(survey);

		Survey survey2 = new Survey();
		survey2.setId((long) 2);
		survey2.setMusicGenreId((long) 1);
		survey2.setEmail("taker_andres@gmail.com");

		surveys.add(survey2);
	}

	void createResults() {
		results = new ArrayList<>();

		Object[] objects = new Object[] { "Rock", 2 };
		results.add(objects);

		Object[] objects2 = new Object[] { "Pop", 1 };
		results.add(objects2);
	}

	@Test
	void findAllSurvey() {
		when(all.allSurvey()).thenReturn(surveys);
		assertNotNull(controller.list());
	}

	@Test
	void findAllResults() {
		when(allResults.resultsSurveyList()).thenReturn(results);
		assertNotNull(controller.results());
	}
	
	@Test
	void create() {
		when(repository.save(any())).thenReturn(survey);
		when(creator.create(any())).thenReturn(survey);
		assertNotNull(controller.create(new Survey()));
	}
}
