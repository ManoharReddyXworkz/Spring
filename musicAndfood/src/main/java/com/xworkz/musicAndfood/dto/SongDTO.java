package com.xworkz.musicAndfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SongDTO {

	private String songName;
	private String SingerName;
	private String time;
	private String Producer;
	private String lyricsWritter;
	private String language;
	private String type;
	
	
	public SongDTO() {
		System.out.println("calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
}

	

