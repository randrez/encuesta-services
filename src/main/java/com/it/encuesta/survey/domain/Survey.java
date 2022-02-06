/**
 * 
 */
package com.it.encuesta.survey.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Reinaldo Andrés Jaimes Muñoz
 *
 */
@Entity
@Table(name="surveys")
public class Survey implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="music_genre_id")
	private Long musicGenreId;
	
	@Column(name="email", unique = true)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMusicGenreId() {
		return musicGenreId;
	}

	public void setMusicGenreId(Long musicGenreId) {
		this.musicGenreId = musicGenreId;
	}
	
	
}
