package gestion_pret_boutiquier.Core;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.List;

import gestion_pret_boutiquier.Data.Entity.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositoryJpaimpl <T>implements  Repository<T> {
    protected EntityManager em;
    protected Class<T> type;
    protected String table;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MYSQLDETTES");


    public RepositoryJpaimpl(Class<T> type) {
        this.type = type;
        if (em==null) {
            em=emf.createEntityManager();
            
        }
    }


    @Override
    public boolean insert(T objet) {
        try {
            em.getTransaction().begin();
            em.persist(objet);
            em.getTransaction().commit();
        } catch (Exception e) {
           em.getTransaction().rollback();
        }
       return true;
    }

    @Override
   public List<T> selectAll() {

        
        List<T> list=null;
        try {
            em.getTransaction().begin();
            list= this.em.createQuery("SELECT e FROM " + table + " e", type).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
           em.getTransaction().rollback();
           e.printStackTrace();
        }
       return list;
    }
    

  

    

    

  
}
