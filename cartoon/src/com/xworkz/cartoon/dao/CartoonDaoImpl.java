package com.xworkz.cartoon.dao;

import javax.persistence.EntityManagerFactory;

import static com.xworkz.cartoon.util.CartoonUtil.*;

public class CartoonDaoImpl implements CartoonDao{

	EntityManagerFactory factory = getFactory();

	@Override
	public Boolean save(List<CartoonEntity> entities) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			for (CartoonEntity cartoonEntity : entities) {
				manager.persist(cartoonEntity);
			}
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByName(String name) {
		EntityManager manager = null;
		try {

			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity cartoon = (CartoonEntity) obj;
				return cartoon;
			} else {
				System.out.println("Unable To Find");
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Integer total() {
		EntityManager manager = null;
		try {

			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("getCount");
			Object obj = query.getSingleResult();
			System.out.println(obj);
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		EntityManager manager = null;
		try {

			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("getAll");
			Object obj = query.getSingleResult();
			if (obj != null) {
				Object[] array = (Object[]) obj;
				return (CartoonEntity) array[1];
			}
			System.out.println("The Max Createddate is:" + obj);
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			query.setParameter("nm", name);
			query.setParameter("cc", country);
			query.setParameter("ge", gender);
			query.setParameter("at", author);
			Object obj = query.getSingleResult();
			if (obj != null) {
				CartoonEntity cartoon = (CartoonEntity) obj;
				return cartoon;
			} else {
				System.out.println("Unable To Find");
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public String findAuthorByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAuthor");
			query.setParameter("nm", name);
			Object obj = query.getSingleResult();
			if (obj != null) {
				String cartoon = (String) obj;
				return cartoon;
			} else {
				System.out.println("Unable To Find");
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public Object[] findNameAndCountryByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findNameAndCountry");
			query.setParameter("date", author);
			Object obj = query.getSingleResult();
			Object[] result = (Object[]) obj;
			return result;

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public LocalDateTime findCreadtedDateByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findCreatedDate");
			query.setParameter("date", author);
			Object obj = query.getSingleResult();
			if (obj != null) {
				LocalDateTime cartoon = (LocalDateTime) obj;
				return cartoon;
			} else {
				System.out.println("Unable To Find");
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public void updateAuthorByName(String author, String name) {

		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateAuthor");
			query.setParameter("at", author);
			query.setParameter("nm", name);
			query.executeUpdate();
			System.out.println("The Updated Values of Author are:" + author);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void updateTypeByName(String type, String name) {

		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("updateType");
			query.setParameter("type", type);
			query.setParameter("name", name);
			query.executeUpdate();
			System.out.println("The Updated Values of type is:" + type);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			Query query = manager.createNamedQuery("deleteByName");
			query.setParameter("dname", name);
			query.executeUpdate();
			System.out.println("The Deleted Name Of Row of Table is :" + name);
			tx.commit();
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}

	}

	@Override
	public List<CartoonEntity> findAll() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByList");
			List<CartoonEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}

		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAll();
	}

	@Override
	public List<CartoonEntity> findAllByAuthor(String author) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByAuthor");
			query.setParameter("aut", author);
			List<CartoonEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}
		return CartoonDAO.super.findAllByAuthor(author);
	}


	@Override
	public List<CartoonEntity> findAllByAuthorAndGender(String author, String gender) {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllByAuthorAndGender");
			query.setParameter("aut", author);
			query.setParameter("gen", gender);
			List<CartoonEntity> entity = query.getResultList();
			if (entity != null) {
				return entity;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {

			manager.close();
		}
		return CartoonDAO.super.findAllByAuthorAndGender(author, gender);
	}

	@Override
	public List<String> findAllName() {
		EntityManager manager = null;
		try {

			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllName");
			List<String> entity = query.getResultList();
			if(entity != null) {
				return entity;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {

			manager.close();
		}
		return null;

	}
	
	@Override
	public List<String> findAllCountry() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllCountry");
			List<String> entity = query.getResultList();
			if(entity != null) {
				return entity;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonDAO.super.findAllCountry();
	}

	@Override
	public List<Object[]> findAllNameAndCountry() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllNameAndCountry");
			@SuppressWarnings("unchecked")
			List<Object[]> list = query.getResultList();
			if(list != null) {
				return list;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonDAO.super.findAllNameAndCountry();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findAllNameAndCountryAndAuthor() {
		EntityManager manager = null;
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAllNameAndCountryAndAuthor");
			List<Object[]> list = query.getResultList();
			if(list != null) {
				return list;
			}
		}
		catch(PersistenceException p) {
			p.printStackTrace();
		}
		finally {
			manager.close();
		}
		return CartoonDAO.super.findAllNameAndCountryAndAuthor();
	}

	@Override
	public CartoonEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime findCreadtedDateByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime findCreadtedDateByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime findCreadtedDateByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByMaxCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartoonEntity findByNameAndCountryAndGenderAndAuthor(String name, String country, String gender,
			String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDateTime findCreadtedDateByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}
}
