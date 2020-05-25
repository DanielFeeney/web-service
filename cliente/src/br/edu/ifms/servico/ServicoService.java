/**
 * ServicoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.edu.ifms.servico;

public interface ServicoService extends javax.xml.rpc.Service {
    public java.lang.String getServicoAddress();

    public br.edu.ifms.servico.Servico getServico() throws javax.xml.rpc.ServiceException;

    public br.edu.ifms.servico.Servico getServico(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
