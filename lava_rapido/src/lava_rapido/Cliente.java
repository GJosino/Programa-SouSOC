package lava_rapido;

public class Cliente {
	private String nome;
	private String cpf;
	private String numeroTel;
	
	public Cliente(String nome, String cpf, String numeroTel) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroTel = numeroTel;
		System.out.println("Cliente: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Número de Telefone: " + numeroTel);
		System.out.println("Foi cadastrado com sucesso");
	}
	
	public String getNome() {
		return this.nome;
	}
}
