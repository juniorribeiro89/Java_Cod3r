package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author junior
 *
 */
public class ImprimindoOnjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Junior", "Leo", "Jaira", "Carlos");

		// iterator using for.
		System.out.println("\nUsando apenas o for!");
		for (int nomes = 0; nomes < aprovados.size(); nomes++) {
			System.out.println(aprovados.get(nomes));
		}
		
		System.out.println("\nUsando o ForEach");		
		//iterator using forEach.
		for (String nomes : aprovados) {
			System.out.println(nomes);
			
		}
		
		System.out.println("\nUsando apenas o Iterador");
		Iterator<String> iterador = aprovados.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		System.out.println("\nUsando o Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);

	}

}
