package modulodois.equals;

public class equals {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.nome = "Junior Ribeiro";
		usuario1.email = "indra@indra.com";

		/*
		 * System.out.println(usuario1 == usuario2);
		 * System.out.println(usuario1.equals(usuario2));
		 * System.out.println(usuario1.email.equals(usuario2.email));
		 */
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		p1.nome = "Mac book";
		p1.marca = "Apple";
		
		p2.nome = "Mac book";
		p2.marca = "Apple";
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.marca.equals(p2.marca));
	}

}
