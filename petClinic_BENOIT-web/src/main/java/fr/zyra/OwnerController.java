package fr.zyra;

import fr.zyra.petclinic.model.entities.Owner;
import fr.zyra.petclinic.model.facade.FacadeMetier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named
@ViewScoped
public class OwnerController implements Serializable {

    private Owner current;

    @Inject
    // @EJB 
    private FacadeMetier facadeMetier;

    public OwnerController() {
    }

    public List<Owner> getSelected() {
        try {
            return facadeMetier.listOwners();
        } catch (Exception ex) {
            Logger.getLogger(OwnerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

}
