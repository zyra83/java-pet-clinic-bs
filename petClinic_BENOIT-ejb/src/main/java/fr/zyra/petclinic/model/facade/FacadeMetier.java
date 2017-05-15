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
@LocalBean
@CommonsLog
public class FacadeMetier implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public FacadeMetier() {
        // TODO Auto-generated constructor stub
    }

    public void creerVoiture(Owner v) throws Exception {
//        DaoFactory.fabriquerDaoOwner().create(v);
    }

    public void supprimerVoiture(Owner v) throws Exception {
//        DaoFactory.fabriquerDaoOwner().delete(v);
    }

    public List<Owner> listOwners() throws Exception {
        System.out.println(em.toString());
//        try {
//            TypedQuery<Owner> m = em.createQuery("SELECT o FROM Owner o", Owner.class);
//             return m.getResultList();
//        } catch (RuntimeException e) {
//            throw new RuntimeException("Impossible de lire les owners" + e.getMessage(), e);
//        }

        try {
            return DaoFactory.fabriquerDaoOwner().readAll();
        } catch (RuntimeException e) {
            log.info("Foirade" + e.getMessage());
        }
        return null;

    }

}
