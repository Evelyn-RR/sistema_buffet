package dao;

import javax.persistence.*;

/**
 * * * @author Moreno
 */
public class ManagerFactory {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            try {
                emf = Persistence.createEntityManagerFactory("Sistema_buffetPU");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return emf.createEntityManager();
    }
}
