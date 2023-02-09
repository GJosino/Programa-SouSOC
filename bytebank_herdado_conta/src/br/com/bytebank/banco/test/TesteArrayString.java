package br.com.bytebank.banco.test;

import java.util.Iterator;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayString {
	
	public static void main(String[] args) {

		System.out.println("Funcionou");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
	}
}
