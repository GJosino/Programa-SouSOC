package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {

		public static void main(String[] args) {
			
			System.out.println("testando condicionais");
			int idade = 16;
			int quantidadePessoa =3;
			if(idade >= 18) {
				System.out.println("voce tem mais de 18 anos!");
				System.out.println("Seja bem vindo");
			} else {
				if(quantidadePessoa >= 2) {
					System.out.println("Voce nao tem 18, mas pode entrar, "
							+ "pois está acompanhado");
				} else {
					System.out.println("Infelizmente voce nao pode entrar");
					
				}
			}
		}
}
