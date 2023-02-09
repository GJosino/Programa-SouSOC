package lava_rapido;

public class Carro {
	//ATRIBUTOS////////////////////////////////////////////////////////
	private String nome;
	private String placa;
	private String cor;
	private boolean lavagemCompleta;
	private String tipoLavagem;
	private Cliente cliente;
	
	public Carro(String nome, String placa, String cor, boolean lavagemCompleta, Cliente cliente) {
		this.nome = nome;
		this.placa = placa;
		this.cor = cor;
		this.lavagemCompleta = lavagemCompleta;
		this.cliente = cliente;
		
		if(lavagemCompleta) {
			tipoLavagem = "Completa";
		} else {
			tipoLavagem = "Rápida";
		}
		System.out.println("Nome do dono:" + cliente.getNome());
		System.out.println("O carro " + nome + ", da placa " + placa + ", da cor " + cor + " foi registado para fazer lavagem do tipo " + tipoLavagem);
	}
	
	//METODOS//////////////////////////////////////////////////////////
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	
	
}
