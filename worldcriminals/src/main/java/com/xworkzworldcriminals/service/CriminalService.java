package com.xworkzworldcriminals.service;

import java.util.List;

import com.xworkzworldcriminals.dto.CriminalDTO;

public interface CriminalService {

	public Boolean validateAndSave(CriminalDTO criminal);
	public List<CriminalDTO> findAll();
}