package oo.polimorfismo;

public class Feijao extends Comida{
	
	//private double peso; Retira-se o atributo quando extends

	public Feijao(double peso) {
		super(peso);
	}
}

/*	Extendendo de outra classe, não se faz necessario.
 * 
 * public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
	*/
	

