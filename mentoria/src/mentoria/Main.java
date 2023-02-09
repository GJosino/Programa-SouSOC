package mentoria;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//		Gerente gerente = new Gerente();
//		gerente.getLucro();
//		gerente.mostraLucro();
		
		
		List<String> pessoas = new ArrayList<>();
		pessoas.add("Gustavo");
		pessoas.add("Josino");
		pessoas.add("Jozen");
		pessoas.forEach(palavra -> System.out.println(palavra));
	}

}
