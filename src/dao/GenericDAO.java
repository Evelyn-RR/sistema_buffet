package dao;

import entity.Orcamento;
import entity.Produto;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * * * @author Moreno
 */
public class GenericDAO<T> {

    private final EntityManager entityManager;
    private final Class persistentClass;

    public GenericDAO() {
        this.entityManager = ManagerFactory.getEntityManager();
        this.persistentClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void inserir(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().persist(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void persist(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().persist(entity);
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    public void commit(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }
    
    public void editar(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().merge(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public void excluir(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();
        try {
            tx.begin();
            getEntityManager().remove(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public List<T> selecionarTodos() throws Exception {
        CriteriaQuery<T> criteria = getEntityManager().getCriteriaBuilder().createQuery(persistentClass);
        criteria.select(criteria.from(persistentClass));
        return getEntityManager().createQuery(criteria).getResultList();
    }

    public List<T> findByName(String tipo) {
        Query query= getEntityManager().createNamedQuery("Produto.findByTipo");
        tipo = "%"+tipo+"%";
        query.setParameter("tipo",tipo);
        return query.getResultList();
    }
    
    public List<T> findOrcamentoId() {
        Query query= getEntityManager().createNamedQuery("Orcamento.findById");
        return query.getResultList();
    }
    
    public List<T> findOrcamentoIdLanc(Integer il) {
        //Query query= getEntityManager().createQuery("SELECT l FROM Lancamento l WHERE l.orcamento_id like :orcamentoId");
        Query query= getEntityManager().createNamedQuery("Lancamento.findByIl");
        query.setParameter("il", il);
        return query.getResultList();
    }

    public List<T> findOrcamentoIdPaco(Integer ip) {
        //Query query= getEntityManager().createQuery("SELECT l FROM Lancamento l WHERE l.orcamento_id like :orcamentoId");
        Query query= getEntityManager().createNamedQuery("Pacote.findByIdGambiarra");
        query.setParameter("ip", ip);
        return query.getResultList();
    }
    
    public T selecionarPorCodigo(int codigo) {
        return (T) getEntityManager().getReference(persistentClass, codigo);
    }

    private void close() {
        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
    }
}
