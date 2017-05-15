package fr.zyra;

import fr.zyra.petclinic.model.entities.Owner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.extern.apachecommons.CommonsLog;

@Named("YOLOCTRL")
@ViewScoped
@CommonsLog
// c'est un bean donc serializable
public class OwnerPageController implements Serializable {

//    @Inject
//     @EJB 
//    private FacadeMetier facadeMetier;
    // c'est un bean donc constructeur VIIIIIDDDEEEE
    public OwnerPageController() {

    }

    public List<Owner> getSelected() {
        ArrayList<Owner> a = new ArrayList<>();
        a.add(new Owner("rir"));
        a.add(new Owner("fifi"));
        return a;
    }

}
