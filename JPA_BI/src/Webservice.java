import java.util.LinkedList;
import java.util.List;


public class Webservice {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBController dbc = new DBController();
	}
	
	public boolean addCustomer(String vorname, String name, String adresse)
	{	
		DBController dbc = new DBController();
		Customer c1 = new Customer();
		c1.setName(vorname+ " " +name);
		
		Address ad1 = new Address();
		ad1.setStrasse(adresse);
		
	return dbc.addCustomer(c1, ad1);
	} 
	
	public boolean searchCustomer(String vorname, String name)
	{
		DBController dbc = new DBController();
		return dbc.searchCustomer(vorname, name);
	}

}
