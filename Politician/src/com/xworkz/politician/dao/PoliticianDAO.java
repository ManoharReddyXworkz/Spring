package com.xworkz.politician.dao;

import com.xworkz.politician.dto.PoliticianDTO;

public interface PoliticianDAO {

Boolean save (PoliticianDTO dto);
PoliticianDTO findById(int id);
/*PoliticanDTO findByIdAndPresident(int id,String name);
PoliticanDTO findByIdAndPresidentAndName(int id,String name,String president);
PoliticanDTO findByIdName(int id,String name);
String findNameById(int id);
String friendPresidentByIdAndName(String name,int id);
int getTotal();
PoliticanDTO findPartyByMaxMembers();*/



}
