/**
 * 
 */
package com.it.encuesta.genre_music.application.create_test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.genre_music.application.create.MusicGenreCreator;
import com.it.encuesta.genre_music.domain.MusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenreRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class MusicGenreCreatorTest {
	
	@Mock
	private MusicGenreRepository repository;
	
	@InjectMocks
	private MusicGenreCreator creator;
	
	private MusicGenre musicGenre;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		
		musicGenre = new MusicGenre();
		musicGenre.setId((long) 1);
		musicGenre.setName("Rock");
	}

	@Test
	void create() {
		when(repository.save(any())).thenReturn(musicGenre);
		assertNotNull(creator.create(new MusicGenre()));
	}

}
