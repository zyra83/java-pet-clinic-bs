/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 *
 * @author mickael
 */
// GROS JAVA
@Dependent // pour suivre @Inject du @Named et se mettre au même scope que l'apellant
@SuppressWarnings("serial")
// LBK
@FieldDefaults(level = AccessLevel.PRIVATE)
// JPA
@Entity
@Table(name = "OWNER")
public class Owner extends AbstractEntity {

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "NAME", length = 50)
    // BV
    @Pattern(regexp = "[A-zÀ-ú]+", message = "Le nom doit être composé uniquement de lettres minuscules/majuscules.")
    String name;

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "FIRST_NAME", length = 50)
    // BV
    @Pattern(regexp = "[A-zÀ-ú]+", message = "Le prénom doit être composé uniquement de lettres minuscules/majuscules.")
    String firstName;

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "PHONE", length = 50)
    String phone;

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "EMAIL", length = 50)
    String email;

    // JPA
    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "OWNER_ID")
    Collection<Animal> animals;

    /**
     * Retourne une liste non modiafiable des animaux.
     *
     * @return
     */
   
    
    public Collection<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    /**
     * Ajoute un animal de compagnie au propriétaire.
     *
     * @param animals
     */
    public void addAnimal(Animal... animals) {
        if (animals == null) {
            this.animals = new ArrayList<>();
        }
        for (Animal animal : animals) {
            if (!this.animals.contains(animal)) {
                this.animals.add(animal);
            }
        }
    }

    /**
     * Supprime l'animal de compagnie
     *
     * @param animal
     */
    public void deleteAnimal(Animal animal) {
        if (this.animals != null) {
            this.animals.remove(animal);
        }
    }

    public Owner() {
    }

    public Owner(String name) {
        this.name = name;
    }

}
