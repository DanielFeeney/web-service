/**
 * ServicoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.ifms.servico;

public class ServicoServiceLocator extends org.apache.axis.client.Service implements br.edu.ifms.servico.ServicoService {

    public ServicoServiceLocator() {
    }


    public ServicoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Servico
    private java.lang.String Servico_address = "http://localhost:8080/webService/services/Servico";

    public java.lang.String getServicoAddress() {
        return Servico_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicoWSDDServiceName = "Servico";

    public java.lang.String getServicoWSDDServiceName() {
        return ServicoWSDDServiceName;
    }

    public void setServicoWSDDServiceName(java.lang.String name) {
        ServicoWSDDServiceName = name;
    }

    public br.edu.ifms.servico.Servico getServico() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Servico_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServico(endpoint);
    }

    public br.edu.ifms.servico.Servico getServico(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.edu.ifms.servico.ServicoSoapBindingStub _stub = new br.edu.ifms.servico.ServicoSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicoEndpointAddress(java.lang.String address) {
        Servico_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.edu.ifms.servico.Servico.class.isAssignableFrom(serviceEndpointInterface)) {
                br.edu.ifms.servico.ServicoSoapBindingStub _stub = new br.edu.ifms.servico.ServicoSoapBindingStub(new java.net.URL(Servico_address), this);
                _stub.setPortName(getServicoWSDDServiceName());
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
        if ("Servico".equals(inputPortName)) {
            return getServico();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servico.ifms.edu.br", "ServicoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servico.ifms.edu.br", "Servico"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Servico".equals(portName)) {
            setServicoEndpointAddress(address);
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
