package com.xworkz.milkshop.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dto.MilkShopDTO;

@Repository
public class MilkShopDAOImpl implements MilkShopDAO{

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public boolean save(MilkShopDTO milk) {
		
		System.out.println("Calling Save Method Of DAO");
		
		 EntityManager createEntityManager = factory.createEntityManager();

			try {
				
				 EntityTransaction transaction = createEntityManager.getTransaction();
				 transaction.begin();
				 createEntityManager.persist(milk);
				 transaction.commit();

			} catch (PersistenceException e) {
				System.out.println("exception in save dao" + e.getMessage());
			}
			finally {
				createEntityManager.close();
			}
			return true;

	}

}
