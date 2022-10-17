package com.xworkzworldcriminals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkzworldcriminals.dao.CriminalDAO;
import com.xworkzworldcriminals.dto.CriminalDTO;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	private CriminalDAO criminalDAO;

	public CriminalServiceImpl() {

		System.out.println("Calling Default Constructor of:"+this.getClass().getSimpleName());
	}

	@Override
	public Boolean validateAndSave(CriminalDTO criminal) {
		System.out.println("Calling ");
		if(criminal.getCriminalAge() != null & criminal.getCriminalType() != null & criminal.getNetWorth() != null) {
		System.out.println("Entered Details Are Valid");
		criminalDAO.save(criminal);
		return true;
	}

		else {

			System.out.println("Entered Details Are Invalid");
		}
		return null;
	}

	@Override
	public List<CriminalDTO> findAll() {
		System.out.println("Calling FindAll Method Of Service");
		List<CriminalDTO> findAll = criminalDAO.findAll();
		return findAll;
	}

	}


