package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
	
		//generics
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(22,11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta
		ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(33,311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33,322);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("---------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		
	}

}
