package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;

public abstract class DAO<T> {
    protected abstract String getSqlString();
    protected abstract Class getClassName();

    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    private void begin() {
        entityManagerFactory = Persistence
                .createEntityManagerFactory("ja-decolou");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    private void close() {
        if (Objects.nonNull(this.entityManager)) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().commit();
            }
            this.entityManager.close();
        }
        if (Objects.nonNull(this.entityManagerFactory)) {
            this.entityManagerFactory.close();
        }
    }

    public void save(T domain) {
        begin();
        entityManager.persist(domain);
        close();
    }

    public void update(T domain) {
        begin();
        entityManager.persist(domain);
        close();
    }

    public void remove(T domain) {
        begin();
        entityManager.remove(domain);
        close();
    }

    public List<T> findAll() {
        begin();
        Query query = entityManager.createQuery(getSqlString());
        List<T> list = query.getResultList();
        close();
        return list;
    }
}
