/**
 * 
 */
package com.it.encuesta.genre_music.application.find_all_test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.genre_music.application.find_all.AllMusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenreRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class AllMusicGenreTest {
	
	@Mock
	private MusicGenreRepository repository;
	
	@InjectMocks
	private AllMusicGenre all;
	
	ArrayList<MusicGenre> genres;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		genres = new ArrayList<>();
		MusicGenre musicGenre;
		musicGenre = new MusicGenre();
		musicGenre.setId((long) 1);
		musicGenre.setName("Test");
		genres.add(musicGenre);
	}
	
	@Test
	void findAll() {
		when(repository.findAll()).thenReturn(genres);
		assertNotNull(all.allMusicGenre());
	}

}
