package javaBasicoIntroducao;

public class ValorVsRef {

	public static void main(String[] args) {

		double a = 2;
		double b = a;

		// this moment, A e B are equals value
		a++;
		b--;

		System.out.println(a + " " + b);
		
		Data d1 = new Data(03,07,1989);
		Data d2 = d1;
		
		d1.dia = 31;
		d2.dia = 12;
		
		System.out.println(d1.obterDataFormatada());
		
		
				

	}

}
