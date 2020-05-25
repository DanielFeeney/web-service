package br.edu.ifms.servico;

public class ServicoProxy implements br.edu.ifms.servico.Servico {
  private String _endpoint = null;
  private br.edu.ifms.servico.Servico servico = null;
  
  public ServicoProxy() {
    _initServicoProxy();
  }
  
  public ServicoProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicoProxy();
  }
  
  private void _initServicoProxy() {
    try {
      servico = (new br.edu.ifms.servico.ServicoServiceLocator()).getServico();
      if (servico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servico != null)
      ((javax.xml.rpc.Stub)servico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.edu.ifms.servico.Servico getServico() {
    if (servico == null)
      _initServicoProxy();
    return servico;
  }
  
  public java.lang.String recebendoStringXML(java.lang.String xmlCliente) throws java.rmi.RemoteException{
    if (servico == null)
      _initServicoProxy();
    return servico.recebendoStringXML(xmlCliente);
  }
  
  
}