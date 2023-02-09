package bytebank_herdado;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		Funcionario nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("222333555-66");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
		
	}
}
