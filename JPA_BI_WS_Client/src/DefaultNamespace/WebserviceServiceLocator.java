/**
 * WebserviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class WebserviceServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.WebserviceService {

    public WebserviceServiceLocator() {
    }


    public WebserviceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebserviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Webservice
    private java.lang.String Webservice_address = "http://localhost:8080/JPA_BI/services/Webservice";

    public java.lang.String getWebserviceAddress() {
        return Webservice_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebserviceWSDDServiceName = "Webservice";

    public java.lang.String getWebserviceWSDDServiceName() {
        return WebserviceWSDDServiceName;
    }

    public void setWebserviceWSDDServiceName(java.lang.String name) {
        WebserviceWSDDServiceName = name;
    }

    public DefaultNamespace.Webservice getWebservice() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Webservice_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebservice(endpoint);
    }

    public DefaultNamespace.Webservice getWebservice(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.WebserviceSoapBindingStub _stub = new DefaultNamespace.WebserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebserviceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebserviceEndpointAddress(java.lang.String address) {
        Webservice_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.Webservice.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.WebserviceSoapBindingStub _stub = new DefaultNamespace.WebserviceSoapBindingStub(new java.net.URL(Webservice_address), this);
                _stub.setPortName(getWebserviceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Webservice".equals(inputPortName)) {
            return getWebservice();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "WebserviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "Webservice"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Webservice".equals(portName)) {
            setWebserviceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
