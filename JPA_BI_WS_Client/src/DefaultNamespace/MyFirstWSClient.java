package DefaultNamespace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

import javax.wsdl.Input;

public class MyFirstWSClient {

	public static void main(String[] args)
	{		
		Webservice service = null;
		
		int Input=0;
		try
		{
		  WebserviceProxy endpoint = new WebserviceProxy();
		  service = endpoint.getWebservice();
		}
		  catch (Exception e) {
			// TODO: handle exception
			 System.out.println("CU");
			 System.err.println("CU");
	      System.exit(-1);
		}
		
		while(Input!=3)
		{
		showmenu();
		Input = Integer.parseInt(readInput());
		switch (Input)
        {
          case 1 : 
            System.out.println("Name? ");
            String name = readInput();
            System.out.println("Vorname? ");
            String vorname = readInput();
            System.out.println("Adresse? ");
            String adresse = readInput();
            try
            {
        	  service.addCustomer(vorname, name, adresse);
  		    }
  		    catch(RemoteException e)
  		    {
  			  e.printStackTrace();
  		    }
          break;
          
          case 2 : 
          System.out.println("Name? ");
          name = readInput();
          System.out.println("Vorname? ");
          vorname = readInput();
          try
          {
  		  Boolean result = service.searchCustomer(vorname, name);
  		  System.out.println("Ergebnis: "+result.toString());
  		  }
  		  catch(RemoteException e)
  		  {
  			e.printStackTrace();
  		  }
          break;
          
          case 3 :
        	 System.exit(-1); 
          break;
          
          default : 
          break;
        }
		}
		
		
		
		
		
//		boolean result = false;
//		try
//		{
//		WebserviceProxy endpoint = new WebserviceProxy();
//		Webservice service = endpoint.getWebservice();
//		service.addCustomer("Heinz", "Teststr","Addr");
//		result = service.searchCustomer("Heinz","Teststr");
//		}
//		catch(RemoteException e)
//		{
//			e.printStackTrace();
//		}
//		
//		System.out.println("Server sagt: " + result);
	}
	
	public static void showmenu()
	{
		System.out.println("Was wollen Sie tun?");
		System.out.println("  1) Kunde anlegen");
		System.out.println("  2) Kunde suchen");
		System.out.println("  3) Beenden");
	}
	
	public static String readInput(){
		BufferedReader in
		   = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			return in.readLine();
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;	
	}
}
