package fr.zyra.petclinic.model.facade;

import fr.zyra.petclinic.model.dao.OwnerJpaDao;
import fr.zyra.petclinic.model.entities.Owner;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

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

       @PersistenceContext(unitName="petClinic")
    private EntityManager em;
    
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
    
    public void genererBdd(){
        
        
        
        Map properties = new HashMap();
   
   properties.put("javax.persistence.schema-generation.scripts.action", "drop-and-create");
   properties.put("javax.persistence.schema-generation.scripts.drop-target", "jpa21-generate-schema-no-connection-drop.jdbc");
   properties.put("javax.persistence.schema-generation.scripts.create-target", "jpa21-generate-schema-no-connection-create.jdbc");
   Persistence.createEntityManagerFactory("petClinic", properties);
   
   
    }

}
