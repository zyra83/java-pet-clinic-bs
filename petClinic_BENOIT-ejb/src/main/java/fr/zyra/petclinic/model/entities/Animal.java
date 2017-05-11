/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.zyra.petclinic.model.entities;

import fr.zyra.petclinic.model.refs.Breed;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.metamodel.CollectionAttribute;
import javax.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 *
 * @author mickael
 */
// GROS JAVA
@SuppressWarnings("serial")
// LBK
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
// TODO : LBK - MEF ArrayLists !
// @NoArgsConstructor
// JPA
@Entity
@Table(name = "ANIMAL")
public class Animal extends AbstractEntity {

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "NICKNAME", length = 50)

    String nickName;

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "BIRTH_DATE")
    LocalDate birthDate;

    // LBK
    @Getter
    @Setter
    // JPA
    @Column(name = "PICTURE")
    LocalDate picture;

    // LBK
    @Getter
    @Setter
    // JPA
    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(50)", length = 50)
    Breed breed;

}
