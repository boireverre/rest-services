package fr.midix.services.common;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.midix.services.common.Provider;
import org.osoa.sca.annotations.Destroy;
import org.osoa.sca.annotations.Init;
import org.osoa.sca.annotations.Property;
import org.osoa.sca.annotations.Scope;

@Scope("COMPOSITE")
public class EntityManagerProviderImpl implements Provider<EntityManager> {
    @Property(required = true)
    public String persistenceUnitName;
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Destroy
    public void destroy() {
        entityManagerFactory.close();
    }

    public EntityManager get() {
        return this.entityManager;
    }

    @Init
    public void setup() {
        try {
            entityManagerFactory = Persistence
                    .createEntityManagerFactory(persistenceUnitName);
            entityManager = entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}