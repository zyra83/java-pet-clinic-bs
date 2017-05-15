package fr.zyra;

import fr.zyra.petclinic.model.dao.OwnerJpaDao;
import fr.zyra.petclinic.model.entities.Owner;
import fr.zyra.petclinic.model.facade.FacadeMetier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

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

    @EJB
    FacadeMetier fm;

    @EJB
    OwnerJpaDao odao;
    
    private List<Owner> lstOwners;

    public List<Owner> getSelected() {
        return lstOwners;
    }

    @PostConstruct
    public void init() {
        lstOwners = new ArrayList();

        try {
            lstOwners.addAll(odao.readAll());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
