package fr.zyra;

import fr.zyra.petclinic.model.entities.Owner;
import fr.zyra.petclinic.model.facade.FacadeMetier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@SuppressWarnings("serial")
@Named
@ViewScoped
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
// c'est un bean donc serializable
public class OwnerPageController implements Serializable {
    
    
    @EJB
    FacadeMetier fm;
    
    private List<String> lstStrings;
    
    private List<Owner> lstOwners;

    public List<Owner> getSelected() {
        
        return lstOwners;
    }

    public List<String> getLstStrings() {
        return lstStrings;
    }

    public void setLstStrings(List<String> lstStrings) {
        this.lstStrings = lstStrings;
    }
    
    
    @PostConstruct
    public void init(){
        this.lstStrings = new ArrayList();
        this.lstStrings.add("Jojo");
        this.lstStrings.add("Yolo");
        
       lstOwners = new ArrayList();
       lstOwners.add(new Owner("rir"));
       lstOwners.add(new Owner("fifi"));
       
       
        try {
            lstOwners.addAll(fm.listOwners());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(lstOwners.size());
    }
    
    

}
