package fr.zyra.petclinic.model.facade;

import fr.zyra.petclinic.model.entities.Owner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

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
//        try {
//            return DaoFactory.fabriquerDaoOwner().readAll();
//        } catch (Exception e) {
//            log.info("Foirade" + e.getMessage(), e);
//        }
//        return new ArrayList<>();
        System.out.println("JPP DU JAVA DE MERDE");
        ArrayList<Owner> a =  new ArrayList<>();
        a.add(new Owner("riri"));
        a.add(new Owner("fifi"));
        return a;

    }

}
