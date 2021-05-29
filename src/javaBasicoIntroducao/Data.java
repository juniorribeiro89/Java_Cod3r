package javaBasicoIntroducao;

public class Data {
	int dia;
	int mes;
	int ano;

	Data() {
		/*
		 * this is two method for instance constructor. day = 3; month = 7; year = 1989;
		 */
		this(3, 7, 1989);

	}

	// using the "this" for identify instance or parameter.
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// this string for get format in ToString
	String obterDataFormatada() {
		return String.format("%d,%d, %d", dia, mes, ano);
	}

}
