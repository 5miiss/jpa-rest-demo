package demo.flamingo.Repository;

import org.hibernate.mapping.List;

import demo.flamingo.entities.users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsersRepo {
    
    private  final EntityManagerFactory emf;
    private  final EntityManager em;

     {
        emf = Persistence.createEntityManagerFactory("users");
        em = emf.createEntityManager();
    }

    public boolean test()
    {
        return em.isOpen();
    }

    public users getUser(int id)
    {
        return em.find(users.class, id);
    }
}
