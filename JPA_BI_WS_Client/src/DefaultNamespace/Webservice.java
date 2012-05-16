/**
 * Webservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface Webservice extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public boolean searchCustomer(java.lang.String vorname, java.lang.String name) throws java.rmi.RemoteException;
    public boolean addCustomer(java.lang.String vorname, java.lang.String name, java.lang.String adresse) throws java.rmi.RemoteException;
}
