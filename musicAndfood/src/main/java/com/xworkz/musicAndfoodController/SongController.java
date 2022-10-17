package com.xworkz.musicAndfoodController;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.musicAndfood.dto.SongDTO;

@Component
@RequestMapping("/")
public class SongController{
	
	Collection<SongDTO> musicList = new ArrayList<SongDTO>();

	public SongController() {
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}

 @RequestMapping("/song.do")	
  public String onAdd(SongDTO song, Model model) {
		System.out.println("Calling onSave Method");
		System.out.println("Details entered Are:"+song);
		musicList.add(song);
		model.addAttribute("song", song);
		return "music.jsp";
}
 @RequestMapping("/view.do")
 public String onView(Model model) {
	 System.out.println("Calling onView Function:");
	 model.addAttribute("list", this.musicList);
	 return "MusicDetails.jsp";
 }
} 