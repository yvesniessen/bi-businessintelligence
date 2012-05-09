import java.util.LinkedList;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;





public class DBController {
	
	
	/**
	 * @param args
	 */
	
	EntityManagerFactory myEntityManagerFactory;
	EntityManager myManager;
	
	public DBController()
	{
		myEntityManagerFactory = Persistence.createEntityManagerFactory("JPA_BI");	
		myManager = myEntityManagerFactory.createEntityManager();
	}
	
	public void finalize()
	{
		myManager.close();
	}
	
	public boolean addCustomer(Customer customer, Address adress)
	{
	  try
	  {
		  if (adress != null)
		  {
		    customer.setAdress(adress);
		  }
			myManager.getTransaction().begin();
			myManager.persist(customer);
			myManager.getTransaction().commit();
	  return true;
	  }
	  catch(Exception e)
	  {
	    return false;
	  }
	}
	
	public String searchCustomer(String name)
	{
		 
		List<Customer> tmp = null;
		try
		{
		javax.persistence.Query q = myManager.createQuery("SELECT k FROM Customer k");
		tmp = q.getResultList();
		}
		catch(Exception e)
		{
			
		}
		
		return tmp.toString();
		
	}
/**	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
		
		for (Customer customer : result) {
			System.out.println(customer.getName());
		}
		
		
	}
	*/
}
