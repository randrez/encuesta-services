/**
 * 
 */
package com.it.encuesta.genre_music.domain;

import java.io.Serializable;

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
@Table(name="music_genres")
public class MusicGenre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return this.id; 
	}
	
	public String getName() {
		return this.name;
	}
	
}
