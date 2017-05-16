package fr.zyra.petclinic.model.facade;

import fr.zyra.petclinic.model.dao.DaoFactory;
import fr.zyra.petclinic.model.dao.OwnerJpaDao;
import fr.zyra.petclinic.model.entities.Owner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import lombok.extern.apachecommons.CommonsLog;

/**
 * La façade métier, suivant les cas va renvoyer directement les DaoException.
 * Mais si on a le temps, catcher les DaoExceptions, et renvoyer les Exceptions
 * de Facade conçues pour êtres affichées.
 *
 * @author mickael
 *
 */
@Stateless
@Dependent
public class FacadeMetier implements Serializable {

    public FacadeMetier() {
        // ça reste un singleton
    }
    
    public Owner obtenirPersonnageDuJour(){
        if(Math.random() > 0.5){
            return new Owner("John Snow");
        } else {
            return new Owner("Aria Stark");
        }
    }

}
