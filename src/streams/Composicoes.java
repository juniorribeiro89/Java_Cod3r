package streams;

import java.util.function.UnaryOperator;

public class Composicoes {
	
	private Composicoes() {
		
	}
	
	public final static UnaryOperator<String> letrasMaiuculas = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+" ";
	
	//public final static UnaryOperator<String> exclamacao = n -> n + " !!! " ;
	
	public final static String grito(String n) {
		return n +" !!!";
	}
}
