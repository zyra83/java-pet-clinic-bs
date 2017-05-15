/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.dao;

import fr.zyra.petclinic.model.entities.Owner;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import lombok.extern.apachecommons.CommonsLog;

/**
 *
 * @author mickael
 */
// @LocalBean // POUR EJB LIGHT
@Stateless
@CommonsLog
public class OwnerJpaDao extends AbstractDao<Owner> {
    
     @PersistenceContext
    private EntityManager em;
	
      

    @Override
    public List<Owner> readAll() {
        
        if(em == null){
            System.out.println("em est null");
        }else  {
            System.out.println("em est pas null");
        }

        try {
            TypedQuery<Owner> m = getEntityManager().createQuery("SELECT o FROM Owner o", Owner.class);
            return m.getResultList();
        } catch (RuntimeException e) {
            throw new RuntimeException("Impossible de lire les owners" + e.getMessage(), e);
        }
    }

}
