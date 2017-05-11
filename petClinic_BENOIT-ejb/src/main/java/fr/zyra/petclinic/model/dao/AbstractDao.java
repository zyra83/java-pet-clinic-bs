/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.entetrs.commons.jpa.AbstractDaoEntrepriseEdition;

/**
 *
 * @author mickael
 * @param <T>
 */
public abstract class AbstractDao<T> extends AbstractDaoEntrepriseEdition<T> {

    @PersistenceContext
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
