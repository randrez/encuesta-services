/**
 * 
 */
package com.it.encuesta.genre_music.application.create;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.encuesta.genre_music.domain.MusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenreRepository;

/**
 * @author Reinaldo Andrés Jaimes Muñoz
 *
 */
@Service
public final class MusicGenreCreator{
	
	@Autowired
	private MusicGenreRepository repository;

	
	public MusicGenre create(MusicGenre musicGenre) {
		return repository.save(musicGenre);
	}
}
