package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::println;

		List<String> marcasCarros = 
				Arrays.asList("\n Lamborguini ", "Renault ", "MacLaren ");
		
		marcasCarros.stream().forEach(print);
		marcasCarros.stream().map(m -> m.toUpperCase()).forEach(print);
		
		/*
		 * UnaryOperator<String> letrasMaiuculas = n -> n.toUpperCase();
		 * UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+" ";
		 * UnaryOperator<String> exclamacao = n -> n + " !!! " ;
		 */
		
		System.out.print("\nUsando o Composição...");
		marcasCarros.stream()
			.map(Composicoes.letrasMaiuculas)
			.map(Composicoes.primeiraLetra)
			.map(Composicoes::grito)
			.forEach(print);
	}

}
