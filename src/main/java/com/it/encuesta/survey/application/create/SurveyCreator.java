/**
 * 
 */
package com.it.encuesta.survey.application.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.encuesta.survey.domain.Survey;
import com.it.encuesta.survey.domain.SurveyRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
@Service
public class SurveyCreator {

	@Autowired
	private SurveyRepository repository;
	
	public Survey create(Survey survey) {
		return repository.save(survey);
	}
}
