package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamMap {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("\nToro", " Cruzer", " Quik");
		marcas.stream().forEach(print);
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		marcas.stream().map(m -> m.concat("!!!")).forEach(print);

	}

}
