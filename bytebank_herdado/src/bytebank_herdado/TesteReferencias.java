package bytebank_herdado;

public class TesteReferencias {

		public static void main(String[] args) {
			
			Gerente g1 = new Gerente();
			g1.setNome("Marcos");
			g1.setSalario(5000.0);
			

			
			EditorVideo ev = new EditorVideo();

			
			ControleBonificacao controle = new ControleBonificacao();
			controle.registra(g1);

			controle.registra(ev);
			
			
			System.out.println(controle.getSoma());
			
			
			
			
			
		
}
}
