package com.xworkz.politician.runner;

import com.xworkz.politician.constant.PartyNameType;
import com.xworkz.politician.constant.PartySymbolType;
import com.xworkz.politician.dao.PoliticanDAOImpl;
import com.xworkz.politician.dao.PoliticianDAO;
import com.xworkz.politician.dto.PoliticanDTO;
import com.xworkz.politician.dto.PoliticianDTO;

public class Runner {

	public static void main(String[] args) {
		
		PoliticianDTO politicanDTO1 = new PoliticianDTO(1, "Arjun", PartyNameType.AIAMDK, "Manoj", 12, 20000.00, "Delhi",
				"Ramanagara", PartySymbolType.BOOK);
		
		PoliticianDTO politicanDTO2 = new PoliticianDTO(2, "Anil", PartyNameType.INC, "Vinay", 15, 25000.00, "Up",
				"Lucnow", PartySymbolType.CHAIR);
		
		PoliticianDTO politicanDTO3 = new PoliticianDTO(3, "Vijay", PartyNameType.CPI, "Tarun", 30, 30000.00, "Punjab",
				"Chandigrh", PartySymbolType.FAN);
		
		PoliticianDTO politicanDTO4 = new PoliticianDTO(4, "MTB", PartyNameType.BJP, "Rahul", 25, 35000.00, "Banglore",
				"Hoskote", PartySymbolType.PEN);
		
		PoliticianDTO politicanDTO5 = new PoliticianDTO(5, "Praveen", PartyNameType.INC, "Prasad", 35, 40000.00, "kolar",
				"Srinivaspura", PartySymbolType.TV);
		
		PoliticianDTO politicanDTO6 = new PoliticianDTO(6, "Ravi", PartyNameType.MJD, "sai", 33, 55000.00, "Vijaywada",
				"Guntur", PartySymbolType.TABLE);
		
		PoliticianDTO politicanDTO7 = new PoliticianDTO(7, "Kumar", PartyNameType.JDS, "Nickle", 40,650000.00, "Mysuru",
				"Mandya", PartySymbolType.FARMER);
		
		
		PoliticianDTO politicanDTO8 = new PoliticianDTO(8, "Jagan", PartyNameType.YSR, "Mohan", 45, 80000.00, "Hydrabad",
				"Tirupati", PartySymbolType.POT);
		
		PoliticianDTO politicanDTO9 = new PoliticianDTO(9, "Chandra", PartyNameType.TDP, "Babu", 50, 100000.00, "Amravthi",
				"Nallore", PartySymbolType.WATCHE);
		
		
		
		PoliticianDAO politicianDAO = new PoliticianDTO;

		politicianDAO.save(politicanDTO1);
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		PoliticianDTO pid =politicanDTO
		
		
		
	//System.out.println(d);		PoliticianDTO m = politicianDAO.findByIdAndPresidentAndName(, "Babu", "Chandra");
		//System.out.println(m);
	//	PoliticianDTO d = politicianDAO.findByIdAndName(6, "Ravi");
	//System.out.println(d);
	//	String n = politicianDAO.findNameById(7);
	//	System.out.println(n);
		//String p = politicianDAO.findPresidentByIdAndName(7,"Kumar");
	//System.out.println(p);
	//	politicianDAO.gettotal();
	

		
	
		
	}

}
