package login.sign.student.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import login.sign.student.entity.DetailsEntity;

@Component
public class SignReposotoryImpl implements SignLoginIn {

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public boolean save(DetailsEntity entity) {
		System.out.println("repository method");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tran=manager.getTransaction();
		try {
			tran.begin();
			manager.persist(entity);
			tran.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			tran.rollback();
		}finally {
			manager.clear();
		}
		return true;
	}
	@Override
	public Optional<DetailsEntity> LoginByStudentId(String email,String password) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("LoginByStudentId");

			query.setParameter("tag", email);
			query.setParameter("sh", password);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				DetailsEntity ref = (DetailsEntity) singleResult;
				return Optional.of(ref);
			} else {
				System.out.println("data is not present for " + email + password);
				return Optional.ofNullable(null);
			       }
		} finally {
			manager.close();
		}
	}
	@Override
	public Optional<DetailsEntity> LoginByMasterId(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		boolean boo=true;
		try {
			Query query = manager.createNamedQuery("findByShopNameAndId");

			query.setParameter("tag", email);
			query.setParameter("sh", password);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				DetailsEntity ref = (DetailsEntity) singleResult;
				return Optional.of(ref); 
			} else {
				System.out.println("data is not present for " + email + password);
			       
			}
		} finally {
			manager.close();
		}

		return Optional.empty();
	
	}


}
