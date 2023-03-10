package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		//
		Object[] referencias = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 11);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		System.out.println(cc2.getNumero());
		
//		//Object referenciaGenerica = (ContaCorrente) contas[1];
//		System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}
