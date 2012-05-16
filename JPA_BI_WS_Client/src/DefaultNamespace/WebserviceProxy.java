package DefaultNamespace;

public class WebserviceProxy implements DefaultNamespace.Webservice {
  private String _endpoint = null;
  private DefaultNamespace.Webservice webservice = null;
  
  public WebserviceProxy() {
    _initWebserviceProxy();
  }
  
  public WebserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebserviceProxy();
  }
  
  private void _initWebserviceProxy() {
    try {
      webservice = (new DefaultNamespace.WebserviceServiceLocator()).getWebservice();
      if (webservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webservice != null)
      ((javax.xml.rpc.Stub)webservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Webservice getWebservice() {
    if (webservice == null)
      _initWebserviceProxy();
    return webservice;
  }
  
  public boolean searchCustomer(java.lang.String vorname, java.lang.String name) throws java.rmi.RemoteException{
    if (webservice == null)
      _initWebserviceProxy();
    return webservice.searchCustomer(vorname, name);
  }
  
  public boolean addCustomer(java.lang.String vorname, java.lang.String name, java.lang.String adresse) throws java.rmi.RemoteException{
    if (webservice == null)
      _initWebserviceProxy();
    return webservice.addCustomer(vorname, name, adresse);
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (webservice == null)
      _initWebserviceProxy();
    webservice.main(args);
  }
  
  
}