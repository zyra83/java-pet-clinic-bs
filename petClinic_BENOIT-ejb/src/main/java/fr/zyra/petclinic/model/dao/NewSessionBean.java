/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.dao;

import fr.zyra.petclinic.model.entities.Owner;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author martin
 */
@Stateless
// @LocalBean // POUR EJB LIGHT
public class NewSessionBean {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Owner> getOwners() {
        TypedQuery<Owner> m = entityManager.createQuery("SELECT o FROM Owner o", Owner.class);
        return m.getResultList();
    }
}
