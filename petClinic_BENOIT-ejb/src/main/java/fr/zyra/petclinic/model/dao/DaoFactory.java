package fr.zyra.petclinic.model.dao;

/**
 *
 * @author mickael
 */
public final class DaoFactory {

    private DaoFactory() {

    }

    public static OwnerJpaDao fabriquerDaoOwner() {
        return new OwnerJpaDao();
    }

    public static AnimalJpaDao fabriquerDaoAnimal() {
        return new AnimalJpaDao();
    }
}
