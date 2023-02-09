package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

		public static void main(String[] args) {
			
			//Set
			Collection<String> alunos = new HashSet<>();
			alunos.add("Rodrigo Turini");
			alunos.add("Alberto Souza");
			alunos.add("Nico Steppat");
			alunos.add("Sergio Lopes");
			alunos.add("Renan Saggio");
			alunos.add("Mauricio Aniche");
			System.out.println(alunos.size());
			alunos.add("Mauricio Aniche");
			alunos.add("Mauricio Aniche");
			alunos.add("Mauricio Aniche");
			
			System.out.println(alunos.size());
			alunos.remove("Renan Saggio");
			boolean pauloExiste = alunos.contains("Paulo Silveira");
			System.out.println(pauloExiste);
			
			System.out.println(alunos.size());
			System.out.println(alunos);
			
			
			for (String aluno : alunos) {
				System.out.println(aluno);
			}
			alunos.forEach(aluno -> {
				System.out.println("Aluno: " + aluno);
			});
			
			List<String> alunosEmLista = new ArrayList<>(alunos);
			
		}
		
}
