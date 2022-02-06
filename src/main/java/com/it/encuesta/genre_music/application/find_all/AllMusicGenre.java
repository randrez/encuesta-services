/**
 * 
 */
package com.it.encuesta.genre_music.application.find_all;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.it.encuesta.genre_music.domain.MusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenreRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
@Service
public class AllMusicGenre {
	
	@Autowired
	private MusicGenreRepository repository;
	
	
	@Transactional(readOnly=true)
	public List<MusicGenre> allMusicGenre(){
		return (List<MusicGenre>) repository.findAll();
	}
}
