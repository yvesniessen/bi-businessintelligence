package DefaultNamespace;

import java.rmi.RemoteException;

public class MyFirstWSClient {

	public static void main(String[] args)
	{
		String result = "";
		try
		{
			
		WebserviceProxy endpoint = new WebserviceProxy();
		Webservice service = endpoint.getWebservice();
		service.main(null);
		service.addCustomer("Heinz", "Teststr");
		result = service.searchCustomer("Heinz");
		}
		catch(RemoteException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Server sagt: " + result);
	}
}
