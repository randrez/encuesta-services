/**
 * 
 */
package com.it.encuesta.survey.application.create_test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.survey.application.create.SurveyCreator;
import com.it.encuesta.survey.domain.Survey;
import com.it.encuesta.survey.domain.SurveyRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class SurveyCreatorTest {
	
	@Mock
	private SurveyRepository repository;
	
	@InjectMocks
	private SurveyCreator creator;
	
	private Survey survey;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		survey = new Survey();
		survey.setId((long) 1);
		survey.setMusicGenreId((long) 1);
		survey.setEmail("taker.anres@gmail.com");
	}
	
	@Test
	void create() {
		when(repository.save(any())).thenReturn(survey);
		assertNotNull(creator.create(new Survey()));
	}

}
