package streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		//create stream and using method static Stream.of
		Stream<String> lang =  Stream.of("Python, ", "GO, ", "Java, " , "Ruby\n");
		lang.forEach(print);
		
		//Creating Stream with LIST
		String[] matchlangs = {"typeScript, ", "C#, ", "PHP, ", "C++\n"};
		
		Stream.of(matchlangs).forEach(print); 		//static method 
		Arrays.stream(matchlangs).forEach(print);		//stream Arrays
		Arrays.stream(matchlangs,1,3).forEach(print);
		
		//Using List for print
		List<String> OtherLangs = Arrays.asList("\nA ", "B ", "C ", "D ");
				OtherLangs.stream().forEach(print);
		
	}

}
