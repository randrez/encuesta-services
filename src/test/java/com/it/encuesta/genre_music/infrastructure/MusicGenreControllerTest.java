/**
 * 
 */
package com.it.encuesta.genre_music.infrastructure;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.it.encuesta.genre_music.application.create.MusicGenreCreator;
import com.it.encuesta.genre_music.application.find_all.AllMusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenre;
import com.it.encuesta.genre_music.domain.MusicGenreRepository;

/**
 * @author Reinaldo Andres Jaimes Muñoz
 *
 */
public class MusicGenreControllerTest {

	@Mock
	private MusicGenreController controller;
	
	@Mock
	private MusicGenreRepository repository;

	@InjectMocks
	private AllMusicGenre all;

	@InjectMocks
	private MusicGenreCreator creator;

	private ArrayList<MusicGenre> genres;
	private MusicGenre genre;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		createList();
	}

	void createList() {
		genres = new ArrayList<>();

		MusicGenre musicGenre = new MusicGenre();
		musicGenre.setId((long) 1);
		musicGenre.setName("Rock");
		genres.add(musicGenre);

		MusicGenre musicGenre2 = new MusicGenre();
		musicGenre2.setId((long) 2);
		musicGenre2.setName("Pop");
		genres.add(musicGenre2);
	}

	void createMusicGenre() {
		genre = new MusicGenre();
		genre.setId((long) 1);
		genre.setName("Rock");
	}

	@Test
	void findAll() {
		when(all.allMusicGenre()).thenReturn(genres);
		assertNotNull(controller.list());
	}

	@Test
	void create() {
		MusicGenre musicGenre = new MusicGenre();
		musicGenre.setId((long) 1);
		musicGenre.setName("Rock");
		when(repository.save(any())).thenReturn(musicGenre);
		when(creator.create(any())).thenReturn(musicGenre);
		assertNotNull(creator.create(new MusicGenre()));
	}

}
