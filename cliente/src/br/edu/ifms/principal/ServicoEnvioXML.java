package br.edu.ifms.principal;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.edu.ifms.dao.ClienteDao;
import br.edu.ifms.model.Cliente;
import br.edu.ifms.servico.Servico;
import br.edu.ifms.servico.ServicoServiceLocator;

public class ServicoEnvioXML {
	
	public static void main(String[] args) throws ServiceException, RemoteException{
		
		String xml = busca();
		System.out.println("Imprimindo o arquivo xml criado no cliente antes do envio: "
				+ xml);
		
		System.out.println("==========================================================");
		
		Servico servico = new ServicoServiceLocator().getServico();
		String retorno = servico.recebendoStringXML(xml);
		System.out.println("retorno do webservice: " + retorno);
	}

	private static String busca() {
		Cliente cliente = new ClienteDao().busca(1l);
		return cliente.toXML();
	}

}
