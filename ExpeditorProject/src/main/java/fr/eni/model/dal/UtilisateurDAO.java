/**
 * 
 */
package fr.eni.model.dal;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.eni.model.entities.Utilisateurs;

/**
 * @author d144retoreb
 *
 */
public class UtilisateurDAO {
	
	private static final String JPA_UNIT_NAME = "Expeditor";
	private EntityManager entityManager;

	protected EntityManager getEntityManager() {
		if (entityManager == null) {
			entityManager = Persistence.createEntityManagerFactory(
					JPA_UNIT_NAME).createEntityManager();
		}
		return entityManager;
	}
	

	public Utilisateurs getUtilisateurByLoginPassword(String log, String password){
		Utilisateurs util = null;
		Query query = getEntityManager().createNamedQuery("getUtilisateurByLoginPwd");
		query.setParameter("login", log);
		query.setParameter("password", password);
		
		List result = query.getResultList();
		if(!result.isEmpty())
			util = (Utilisateurs) result.get(0);
		
		return util;
	}
}
