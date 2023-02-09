package cliente_webservice;

import java.io.IOException;

import org.apache.hc.client5.http.fluent.Form;
import org.apache.hc.client5.http.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws IOException {

	String conteudo = Request.post("http://localhost:8080/gerenciador/empresas").execute().returnContent().asString();
		
		System.out.println(conteudo);
		
		
	}

}
