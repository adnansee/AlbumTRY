import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class MainApp {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Menu m1 = new Menu();
        Ingredients ingredients =new Ingredients(2,"Potatoes");
        m1.getIngredients().add(ingredients);


        em.persist(m1);


        tx.commit();
        emf.close();
    }
}
