package br.com.bytebank;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new ContaCorrente(123,321);
		
		
		c.deposita(200.30);
		System.out.println(c.getSaldo());
	}

}
