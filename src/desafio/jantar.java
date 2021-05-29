package desafio;

public class jantar {

	public static void main(String[] args) {
		Comida comida1 = new Comida("lasanha", 0.300);
		//Comida comida2 = new Comida("Feijoada", 0.500);

		Caminhada caminhada = new Caminhada("Caminhada", 0.500);

		//Pessoa p1 = new Pessoa("Junior", 60);
		Pessoa p2 = new Pessoa("Brunna", 70);

		System.out.println(p2.apresentar());
		p2.comer(comida1);
		System.out.printf("Após comer %s que tem peso de: %s engordamos para %s",
				comida1.nome, comida1.peso, p2.peso);
		p2.caminha(caminhada);
		System.out.println(" ");
		System.out.printf("Para perde peso eu fiz uma %s e agora peso %s ", 
				caminhada.nome, p2.peso);
				
		// *********************************

		/*
		 * System.out.println(p2.apresentar()); p2.comer(c2);
		 * System.out.printf("Após comer %s que tem peso de: %s Engordamos para %s",
		 * c2.nome, c2.peso, p2.peso);
		 */
	
	}

}
