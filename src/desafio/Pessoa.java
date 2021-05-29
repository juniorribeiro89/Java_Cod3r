package desafio;

public class Pessoa {

	String nome;
	double peso;

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comer(Comida comida) {
		if (comida != null) {
			// this.peso = peso + comida.peso;
			this.peso += comida.peso;
		}
	}

	void caminha(Caminhada caminhada) {
		if (caminhada != null) {
			this.peso -= caminhada.caminhadaPerdePeso;
		}
	}

	String apresentar() {
		return "Meu Nome é " + nome + " e peso " + peso + " Kg";
	}

}
