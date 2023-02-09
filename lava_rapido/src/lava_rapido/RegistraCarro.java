package lava_rapido;

public class RegistraCarro {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Gustavo", "111.222.333-45", "98888-2222");
		Carro carro1 = new Carro("Monza", "5L79H5", "Preto", true, cliente1);
		
		
		Cliente cliente2 = new Cliente("Paulo", "777.888.999-110", "+94444-5555");		
		Carro carro2 = new Carro("Gol", "HTY5124", "Vermelho", false, cliente2);

		System.out.println(carro1.getCliente().getNome());
	}
}
