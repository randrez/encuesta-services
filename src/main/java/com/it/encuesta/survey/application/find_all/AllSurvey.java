/**
 * 
 */
package com.it.encuesta.survey.application.find_all;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.encuesta.survey.domain.Survey;
import com.it.encuesta.survey.domain.SurveyRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
@Service
public class AllSurvey {
	
	@Autowired
	private SurveyRepository respository;
	
	@Transactional(readOnly = true)
	public List<Survey> allSurvey(){
		return (List<Survey>) respository.findAll();
	}
}
