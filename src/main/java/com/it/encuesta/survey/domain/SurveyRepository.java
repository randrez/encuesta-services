/**
 * 
 */
package com.it.encuesta.survey.domain;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public interface SurveyRepository extends CrudRepository<Survey, Long>{
	
	@Query(value="SELECT mg.name, count(mg.id) AS count FROM surveys AS su INNER JOIN music_genres AS mg ON mg.id = su.music_genre_id GROUP BY mg.id", nativeQuery = true)
	List<Object[]> resultsSurvey();
}
