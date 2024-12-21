package gestion_pret_boutiquier.Core;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositoryJpaimpl<T> implements Repository<T> {
    protected EntityManager em;
    protected Class<T> type;
    protected String table;

    // On ne définit pas EntityManagerFactory directement, car il sera initialisé dynamiquement
    protected EntityManagerFactory emf;

    // Méthode pour charger les paramètres depuis le fichier YAML
    private String getPersistenceUnitName() {
        Yaml yaml = new Yaml();

        try (InputStream inputStream = RepositoryJpaimpl.class.getClassLoader().getResourceAsStream("UnitName.yaml")) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Fichier YAML non trouvé !");
            }

            // Charger le fichier YAML
            Map<String, Object> config = yaml.load(inputStream);
            
            // Récupérer la section persistence
            Map<String, Object> persistence = (Map<String, Object>) config.get("persistence");
            
            // Récupérer l'unité active
            String activeUnit = (String) persistence.get("active_unit");
            
            // Récupérer le nom de l'unité de persistance (mysql ou postgres) à partir de "units"
            Map<String, String> units = (Map<String, String>) persistence.get("units");
            return units.get(activeUnit);  // Retourner le nom de l'unité de persistance active
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }




    

    // Constructeur avec paramètre de type
    public RepositoryJpaimpl(Class<T> type) {
        this.type = type;
        String persistenceUnitName = getPersistenceUnitName();

        // Initialiser l'EntityManagerFactory avec l'unité de persistance dynamique
        if (persistenceUnitName != null) {
            emf = Persistence.createEntityManagerFactory(persistenceUnitName);
            if (em == null) {
                em = emf.createEntityManager();
            }
        } else {
            throw new IllegalArgumentException("Nom de l'unité de persistance non défini dans le fichier YAML.");
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
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<T> selectAll() {
        List<T> list = null;
        try {
            em.getTransaction().begin();
            list = this.em.createQuery("SELECT e FROM " + table + " e", type).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        return list;
    }
}
