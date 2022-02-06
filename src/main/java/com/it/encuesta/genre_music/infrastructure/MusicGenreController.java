/**
 * 
 */
package com.it.encuesta.genre_music.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.encuesta.genre_music.application.create.MusicGenreCreator;
import com.it.encuesta.genre_music.application.find_all.AllMusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenre;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
@RestController
public class MusicGenreController {

	@Autowired
	private AllMusicGenre all;
	
	@Autowired
	private MusicGenreCreator creator;
	
	@GetMapping("/musicGenre/list")
	public List<MusicGenre> list(){
		return all.allMusicGenre();
	}
	
	@PostMapping("/musicGenre/create")
	public MusicGenre create( @RequestBody MusicGenre musicGenre) {
		return creator.create(musicGenre);
	}
}
