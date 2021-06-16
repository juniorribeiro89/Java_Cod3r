package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
	
		Pessoa convidado1 = new Pessoa(99.65);
		Arroz comida1 = new Arroz(0.2);
		Feijao comida2 = new Feijao(0.1);
		
		System.out.println(convidado1.getPeso());
		convidado1.comer(comida1);
		convidado1.comer(comida2);
		System.out.println(convidado1.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		convidado1.comer(sobremesa);
		System.out.println(convidado1.getPeso());

	}

}
