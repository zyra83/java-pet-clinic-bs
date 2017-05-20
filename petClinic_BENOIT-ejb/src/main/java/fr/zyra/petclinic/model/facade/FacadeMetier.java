package fr.zyra.petclinic.model.facade;

import fr.zyra.petclinic.model.dao.OwnerJpaDao;
import fr.zyra.petclinic.model.entities.Owner;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * La façade métier, suivant les cas va renvoyer directement les DaoException.
 * Mais si on a le temps, catcher les DaoExceptions, et renvoyer les Exceptions
 * de Facade conçues pour êtres affichées.
 *
 * @author mickael
 *
 */
@Stateless
public class FacadeMetier implements Serializable {
    
    @Inject
    OwnerJpaDao ojdao;

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
