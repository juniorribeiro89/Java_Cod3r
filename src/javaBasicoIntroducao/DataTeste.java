package javaBasicoIntroducao;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();

		// get address memories
		d1.obterDataFormatada();
		System.out.println(d1);

		/* get object and setting object in variable dataFormatada
		 * with this we select method obterDataFormatada in d1
		 */
		String dataFormatada = d1.obterDataFormatada();
		System.out.println("Selecionando o Objeto data " + dataFormatada);
	}

}
