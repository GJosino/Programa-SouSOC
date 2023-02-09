package br.com.alura;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestaConexao {
	public static void main(String[] args) {
		Connection connection = DriverManager
				.getConnection("jdbc:mydql://localhost/loja_virtual?useTimezone=true&serverTime=UTC", "root", "password");
		
	}
}
