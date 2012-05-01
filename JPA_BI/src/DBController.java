import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class DBController {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory myEntityManagerFactory = Persistence.createEntityManagerFactory("JPA_BI");
		EntityManager myManager = myEntityManagerFactory.createEntityManager();
		
		//EntityTransaction test = new EntityTransaction();
		
		Customer c1 = new Customer();
		c1.VIP = true;
		c1.setName("Heinz");
		
		Customer c2 = new Customer();
		c2.setName("Thomas");
		
		Address adr = new Address();
		adr.setPlz(52525);
		adr.setOrt("ChecKOut");
		c2.setAdress(adr );
		

		myManager.getTransaction().begin();
		myManager.persist(c1);
		myManager.persist(c2);
		myManager.getTransaction().commit();
	
		javax.persistence.Query q = myManager.createQuery("SELECT k FROM Customer k");
		List<Customer> result = q.getResultList();
		
		for (Customer customer : result) {
			System.out.println(customer.getName());
		}
		myManager.close();
		
	}
	
}
