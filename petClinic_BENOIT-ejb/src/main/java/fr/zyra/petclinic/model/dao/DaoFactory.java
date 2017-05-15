package fr.zyra.petclinic.model.dao;

import javax.enterprise.inject.Produces;

/**
 *
 * @author mickael
 */
public final class DaoFactory {

    private DaoFactory() {

    }

    @Produces
    public static OwnerJpaDao fabriquerDaoOwner() {
        return new OwnerJpaDao();
    }
    
    @Produces
    public static AnimalJpaDao fabriquerDaoAnimal() {
        return new AnimalJpaDao();
    }
}
