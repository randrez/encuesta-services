/**
 * 
 */
package com.it.encuesta.survey.application.results_test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.survey.domain.SurveyRepository;
import com.it.encuesta.survey.results.ResultsSurvey;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class ResultsSurveyTest {
	
	@Mock
	private SurveyRepository repository;
	
	@InjectMocks
	private ResultsSurvey all;
	
	private ArrayList<Object[]> results;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		results = new ArrayList<>();
		Object[] objects = new Object[] {"Rock", 2};
		results.add(objects);
	}
	
	@Test
	void findAll() {
		when(repository.resultsSurvey()).thenReturn(results);
		assertNotNull(all.resultsSurveyList());	
	}

}
