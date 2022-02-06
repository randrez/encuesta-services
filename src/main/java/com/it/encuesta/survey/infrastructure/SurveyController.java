/**
 * 
 */
package com.it.encuesta.survey.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.encuesta.survey.application.create.SurveyCreator;
import com.it.encuesta.survey.application.find_all.AllSurvey;
import com.it.encuesta.survey.domain.Survey;
import com.it.encuesta.survey.results.ResultsSurvey;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
@RestController
public class SurveyController {

	@Autowired
	private SurveyCreator creator;
	
	@Autowired
	private AllSurvey getAll;
	
	@Autowired
	private ResultsSurvey getAllGroup;
	
	@GetMapping("/survey/list")
	public List<Survey> list(){
		return getAll.allSurvey();
	}
	
	@PostMapping("/survey/create")
	public Survey create(@RequestBody Survey survey) {
		return creator.create(survey);
	}
	
	@GetMapping("/survey/results")
	public List<Object[]> results(){
		return getAllGroup.resultsSurveyList();
	}
}
