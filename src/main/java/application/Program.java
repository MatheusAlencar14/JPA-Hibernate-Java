package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pessoa;

public class Program {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        
        Pessoa p = em.find(Pessoa.class, 1);
        
        System.out.println(p);
        
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
