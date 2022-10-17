package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.xworkz.politician.constant.MySqlProperties.*;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.politician.constant.MySqlProperties;
import com.xworkz.politician.constant.PartyNameType;
import com.xworkz.politician.constant.PartySymbolType;
import com.xworkz.politician.constant.PresidentNames;
import com.xworkz.politician.dto.PoliticianDTO;

public class PoliticianDAOImpl implements PoliticianDAO {

	private static final String totalMember = null;
	private static final String partySymbol = null;

	@Override
	public Boolean save(PoliticianDTO dto) {
		try {

			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());

			String sql = "insert into politician.politician_info values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement preStat = connection.prepareStatement(sql);
			preStat.setInt(1, dto.getId());
			preStat.setString(2, dto.getName());
			preStat.setString(3, dto.getPartyname().getName());
			preStat.setString(4, dto.getPresident());
			preStat.setInt(5, dto.getTotalmembers());
			preStat.setDouble(6, dto.getPartybudject());
			preStat.setString(7, dto.getHeadquaters());
			preStat.setString(8, dto.getPartylocation());
			preStat.setString(9, dto.getPartysymbol().getType());
			int noOfRowsAffected = preStat.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("The Values Inserted Are :" + sql);
				System.out.println(noOfRowsAffected);
			} else {
				System.out.println("Unable to insert Data..!!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findById(int id) {
		try(Connection connection =DriverManager.getConnection(URL.getValue(),USERNAME.getValue(),SECRET.getValue());)
				{
			String sql="SELECT * FROM politician.politician_info where id=?";
			PreparedStatement stmt =connection.prepareStatement(sql);
	  		stmt.setInt(1, id);
					ResultSet resultSet = stmt.executeQuery();
					while(resultSet.next()) {
						Integer pid1 =resultSet.getInt(1);
						String name = resultSet.getString(2);
						String pname = resultSet.getString(3);
						String president =resultSet.getString(4);
						Integer numberofMembers =resultSet.getInt(5);
						Double budject =resultSet.getDouble(6);
						String headquaters =resultSet.getString(7);
						String location =resultSet.getString(8);
						String symbol =resultSet.getString(9);

						PoliticianDTO politicianDTO = new PoliticianDTO();
						
						politicianDTO.setId(pid1);
						politicianDTO.setName(name);
						politicianDTO.setPartyName(PartyNameType.getByParty(pname));
						politicianDTO.setPresident(president);
						politicianDTO.setTotalmembers(numberofMembers);
						politicianDTO.setPartybudject(budject);
						politicianDTO.setHeadquaters(headquaters);
						politicianDTO.setPartylocation(location);
						politicianDTO.setPartySymbol(PartySymbolType.getBySymbol(symbol));
						return politicianDTO;	
				}
		
		
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return null;

}
}


public PoliticianDTO findByIdAndPresident(Integer id, String president) {
	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {

		String search = "select * from politicians.politicians_info where cid = ? and president = ?";
		PreparedStatement stmt = connection.prepareStatement(search);
		stmt.setInt(1, id);
		stmt.setString(2, president);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			Integer cid = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String pName = resultSet.getString(3);
			String president1 = resultSet.getString(4);
			Integer numberOfMenbers = resultSet.getInt(5);
			Double budget = resultSet.getDouble(6);
			String headquaters =resultSet.getString(7);
			String location = resultSet.getString(8);
			String symbol =resultSet.getString(9);

			PoliticianDTO politicianDTO = new PoliticianDTO();

			politicianDTO.setId(cid);
			politicianDTO.setName(name);
			politicianDTO.setPartyName(PartyName.getByParty(pName));
			politicianDTO.setPresident(president1);
			politicianDTO.setTotalmembers(numberOfMenbers);
			politicianDTO.setTotalBudget(budget);
			politicianDTO.setHeadquaters(headquaters);
			politicianDTO.setPartylocation(location);
			politicianDTO.setPartySymbol(partySymbol.getBySymbol(symbol));
			return politicianDTO;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}
}



public PoliticianDTO findByIdAndPresidentAndName(Integer id, String president, String name) {
	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {

		String search = "select * from politicians.politicians_info where cid = ? and president = ? and politicianName = ?";
		PreparedStatement stmt = connection.prepareStatement(search);
		stmt.setInt(1, id);
		stmt.setString(2, president);
		stmt.setString(3, name);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			Integer cid = resultSet.getInt(1);
			String pName = resultSet.getString(2);
			String prName = resultSet.getString(3);
			String president1 = resultSet.getString(4);
			Integer numberOfMenbers = resultSet.getInt(5);
			Double budget = resultSet.getDouble(6);
			String symbol = resultSet.getString(7);
			String location = resultSet.getString(8);
			String hQuaters = resultSet.getString(9);

			PoliticianDTO politicianDTO = new PoliticianDTO();
			politicianDTO.setId(cid);
			politicianDTO.setName(pName);
			politicianDTO.setPartyName(PartyName.getByParty(prName));
			politicianDTO.setPresident(president1);
			politicianDTO.setTotalMembers(numberOfMenbers);
			politicianDTO.setTotalBudget(budget);
			politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
			politicianDTO.setLocation(location);
			politicianDTO.setHeadQuaters(hQuaters);

			return politicianDTO;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return null;
}




public PoliticianDTO findByIdAndName(Integer id, String name) {
	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {

		String search = "select * from politicians.politicians_info where cid = ? and politicianName = ?";
		PreparedStatement stmt = connection.prepareStatement(search);
		stmt.setInt(1, id);
		stmt.setString(2, name);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			Integer cid = resultSet.getInt(1);
			String pName = resultSet.getString(2);
			String prName = resultSet.getString(3);
			String president = resultSet.getString(4);
			Integer numberOfMenbers = resultSet.getInt(5);
			Double budget = resultSet.getDouble(6);
			String symbol = resultSet.getString(7);
			String location = resultSet.getString(8);
			String hQuaters = resultSet.getString(9);

			PoliticianDTO politicianDTO = new PoliticianDTO();
			politicianDTO.setId(cid);
			politicianDTO.setName(pName);
			politicianDTO.setPartyName(PartyName.getByParty(prName));
			politicianDTO.setPresident(president);
			politicianDTO.setTotalMembers(numberOfMenbers);
			politicianDTO.setTotalBudget(budget);
			politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
			politicianDTO.setLocation(location);
			politicianDTO.setHeadQuaters(hQuaters);

			return politicianDTO;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return null;
}




public String findNameById(Integer id) {

	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {

		String search = "select politicianName from politicians.politicians_info where cid = ?";
		PreparedStatement stmt = connection.prepareStatement(search);
		stmt.setInt(1, id);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			String name = resultSet.getString(1);
			return name;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return null;
}


@Override
public String findPresidentByIdAndName(Integer id, String name) {
	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {

		String search = "select president from politicians.politicians_info where cid = ? and politicianName = ?";
		PreparedStatement stmt = connection.prepareStatement(search);
		stmt.setInt(1, id);
		stmt.setString(2, name);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			String president = resultSet.getString(1);
			return president;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return null;
}

@Override
public int getTotal() {
	AtomicInteger atomicInteger = new AtomicInteger(0);
	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {
		String query = "select * from politicians_info";
		PreparedStatement stmt = connection.prepareStatement(query);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			atomicInteger.incrementAndGet();
		}
		System.out.println(atomicInteger);
	} catch (SQLException e) {

		e.printStackTrace();
	}

	return 0;
}

@Override
public String findPartyByMaxMembers() {
	try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
			SECRET.getValue())) {
		String query = "select partyName,max(totalMembers) from politicians_info";
		PreparedStatement stmt = connection.prepareStatement(query);
		ResultSet resultSet = stmt.executeQuery();
		while (resultSet.next()) {
			String members = resultSet.getString(1);
			return members;
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
}

@Override
public List<PoliticianDTO> findAll() {
	try {
		Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
		String selectSql = "Select * from politicians_info";
		PreparedStatement statement = connection.prepareStatement(selectSql);
		ResultSet resultSet = statement.executeQuery();
		List<PoliticianDTO> list = new ArrayList<PoliticianDTO>();
		while (resultSet.next()) {
			Integer cid = resultSet.getInt(1);
			String pName = resultSet.getString(2);
			String prName = resultSet.getString(3);
			String president = resultSet.getString(4);
			Integer numberOfMenbers = resultSet.getInt(5);
			Double budget = resultSet.getDouble(6);
			String symbol = resultSet.getString(7);
			String location = resultSet.getString(8);
			String hQuaters = resultSet.getString(9);

			PoliticianDTO politicianDTO = new PoliticianDTO();
			politicianDTO.setId(cid);
			politicianDTO.setName(pName);
			politicianDTO.setPartyName(PartyName.getByParty(prName));
			politicianDTO.setPresident(president);
			politicianDTO.setTotalMembers(numberOfMenbers);
			politicianDTO.setTotalBudget(budget);
			politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
			politicianDTO.setLocation(location);
			politicianDTO.setHeadQuaters(hQuaters);

			list.add(politicianDTO);
		}
		System.out.println("Added Details :" +list.size());
		return list;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return PoliticianDAO.super.findAll();
}

@Override
public List<String> findAllPartyName() {
	try {
		Connection connection = DriverManager.getConnection(URL.getValue(),USERNAME.getValue(), SECRET.getValue());
		String get = "select partyName from politicians_info";
		PreparedStatement stmt = connection.prepareStatement(get);
		ResultSet resultSet = stmt.executeQuery();
		List<String> str = new ArrayList<String>();
		while(resultSet.next()) {
			String pName = resultSet.getString(1);
			str.add(pName);
		}
		System.out.println("No of Parties..!" + str.size());
		return str;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return PoliticianDAO.super.findAllPartyName();
}

@Override
public List<Integer> findAllIds() {
	try {
		Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),SECRET.getValue());
		String query = "select cid from politicians_info";
		PreparedStatement stmt = connection.prepareStatement(query);
		ResultSet resultSet = stmt.executeQuery();
		List<Integer> list = new ArrayList<Integer>();
		while(resultSet.next()) {
			Integer cid = resultSet.getInt(1);
				list.add(cid);
		}
		System.out.println("The Number of Id present:" + list.size());
		return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return PoliticianDAO.super.findAllIds();
}

@Override
public List<Object> findAllNoOfMembersAndFundAndPartyName() {
	try {
		Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
		String sql = "select totalMembers,totalBudjet,partyName from politicians_info";
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet resultSet = stmt.executeQuery();
		List<Object> list = new ArrayList<Object>();
		while(resultSet.next()) {
			Integer members = resultSet.getInt(1);
			Double budjet = resultSet.getDouble(1);
			String name = resultSet.getString(3);
			list.add(members);
			list.add(budjet);
			list.add(name);
		}
		System.out.println("The NoOFMenbers and TotalBudjetOfParty and PartyName is: " + list.size());
		return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return PoliticianDAO.super.findAllNoOfMembersAndFundAndPartyName();
}

}







