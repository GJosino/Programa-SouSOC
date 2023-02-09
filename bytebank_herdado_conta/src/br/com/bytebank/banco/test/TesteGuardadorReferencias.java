package br.com.bytebank.banco.test;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.GuardadorDeContas;
import br.com.bytebank.banco.model.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22,11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta)guardador.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
