/**
 * 
 */
package com.it.encuesta.survey.results;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.encuesta.survey.domain.SurveyRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
@Service
public class ResultsSurvey {

	@Autowired
	private SurveyRepository repository;
	
	@Transactional(readOnly = true)
	public List<Object[]> resultsSurveyList(){
		return repository.resultsSurvey();
	}
}
