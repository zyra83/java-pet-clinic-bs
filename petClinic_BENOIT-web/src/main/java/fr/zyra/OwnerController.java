package fr.zyra;

import fr.zyra.petclinic.model.entities.Owner;
import fr.zyra.petclinic.model.facade.FacadeMetier;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named("ownerController")
@ViewScoped
public class OwnerController implements Serializable {

    private Owner current;
    
    // @Inject ?????!
    @EJB 
    private FacadeMetier facadeMetier;

    public OwnerController() {
    }

    public Owner getSelected() {
        return null;
    }

}
