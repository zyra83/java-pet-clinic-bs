/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.dao;

import fr.zyra.petclinic.model.entities.Owner;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.persistence.TypedQuery;
import lombok.extern.apachecommons.CommonsLog;

/**
 *
 * @author mickael
 */
// @LocalBean // POUR EJB LIGHT
@Dependent
public class OwnerJpaDao extends AbstractDao<Owner> {
    
    @Override
    public List<Owner> readAll() {
        List<Owner> liste = super.readAll();
        System.out.println("taille des resultats : " + liste.size());
        
        
        if(getEntityManager() == null){
            System.out.println("em est null");
        }else  {
            System.out.println("em est pas null");
        }

       return liste;
    }

}
