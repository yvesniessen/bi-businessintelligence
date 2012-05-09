import java.util.LinkedList;
import java.util.List;


public class Webservice {

	/**
	 * @param args
	 */
	
	static DBController dbc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  dbc = new DBController();
	}
	
	public boolean addCustomer(String name, String Adresse)
	{
		Customer c1 = new Customer();
		c1.setName(name);
		
		Address ad1 = new Address();
		ad1.setStrasse(Adresse);
		
	return dbc.addCustomer(c1, ad1);
	} 
	
	public String searchCustomer(String name)
	{
		return dbc.searchCustomer(name);
	}

}
