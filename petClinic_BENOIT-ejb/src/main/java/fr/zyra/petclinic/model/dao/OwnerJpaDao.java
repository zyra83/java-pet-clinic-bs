/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.dao;

import fr.zyra.petclinic.model.entities.Owner;
import javax.ejb.Stateless;

/**
 *
 * @author mickael
 */
@Stateless
// @LocalBean // POUR EJB LIGHT
public class OwnerJpaDao extends AbstractDao<Owner> {

}
