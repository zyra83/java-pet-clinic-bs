package fr.zyra;

import fr.zyra.petclinic.model.entities.Owner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
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
       
        System.out.println(lstOwners.size());
    }
    
    

}
