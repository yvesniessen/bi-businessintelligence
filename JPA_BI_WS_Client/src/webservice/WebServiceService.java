/**
 * WebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface WebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getWebServiceAddress();

    public webservice.WebService getWebService() throws javax.xml.rpc.ServiceException;

    public webservice.WebService getWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
