package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");

		//Comparator<String> comparador = new ComparadorPorTamanho();

		// Collections.sort(palavras, comparador);
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);		
		
		System.out.println(palavras);

			
		Consumer<String> impressor = s -> System.out.println(s);
		Consumer<String> impressor2 = System.out::println;
		palavras.forEach(impressor);
		//código de cima igual o de baixo
		palavras.forEach(s -> System.out.println(s));

	}//main
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;

	}

}