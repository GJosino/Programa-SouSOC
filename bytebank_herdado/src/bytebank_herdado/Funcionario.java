package bytebank_herdado;

public abstract class Funcionario {
		//ATRIBUTOS
		private String nome;
		private String cpf;
		private double salario;
		
		//CONSTRUTOR
		//METODOS
		//metodo sem corpo, nao há implementação AQUI
		public abstract double getBonificacao();
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
}
