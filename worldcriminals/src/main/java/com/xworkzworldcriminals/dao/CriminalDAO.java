package com.xworkzworldcriminals.dao;

import java.util.List;

import com.xworkzworldcriminals.dto.CriminalDTO;

public interface CriminalDAO {

	public void save(CriminalDTO criminal);
	public List<CriminalDTO> findAll();

}
