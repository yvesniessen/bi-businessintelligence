package webservice;

import java.rmi.RemoteException;

public class WebServiceProxy implements webservice.WebService {
  private String _endpoint = null;
  private webservice.WebService webService = null;
  
  public WebServiceProxy() {
    _initWebServiceProxy();
  }
  
  public WebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceProxy();
  }
  
  private void _initWebServiceProxy() {
    try {
      webService = (new webservice.WebServiceServiceLocator()).getWebService();
      if (webService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService != null)
      ((javax.xml.rpc.Stub)webService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.WebService getWebService() {
    if (webService == null)
      _initWebServiceProxy();
    return webService;
  }

@Override
public String helloWorld() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}
  
  
}