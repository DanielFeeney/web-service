package br.edu.ifms.servico;

import com.thoughtworks.xstream.XStream;

import br.edu.ifms.model.Cliente;
import br.edu.ifms.model.Cachorro;

public class Servico {

	public String recebendoStringXML(String xmlCliente) {
		if(xmlCliente != null) {
			System.out.print("Imprimindo arquivo recebido no webservice : "
					+ xmlCliente);
			
			XStream xstream = new XStream();
			Cliente  cliente = (Cliente) xstream.fromXML(xmlCliente);
			
			System.out.println("id cliente = " + cliente.getIdCliente());
			System.out.println("cpf cliente = " + cliente.getCpf());
			System.out.println("rua cliente = " + cliente.getRua());
			System.out.println("cidade cliente = " + cliente.getCidade());
			System.out.println("Listando os cachorros:");
			
			for(Cachorro cachorro : cliente.getCachorros()) {
				System.out.println("id cachorro = " + cachorro.getIdCachorro());
				System.out.println("nome cachorro = " + cachorro.getNome());
				System.out.println("raça cachorro = " + cachorro.getRaca());
				System.out.println("serviço cachorro = " + cachorro.getServicoPet());
				System.out.println("preço serviço cachorro = " + cachorro.getValorServicoPet());
			}
			
			return "Arquivo recebido com sucesso";
		}
		else {
			return "Arquivo com defeito: não processado";
		}
		
		
	}
}
