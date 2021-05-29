package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	List<Compra> compras = new ArrayList<>();

	// Constructor
	Cliente(String nome) {
		this.nome = nome;
	}

	// Method add buy
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	// Valor total para todos os todas as compras.
	double obterValorTotal() {

		double total = 0;
		for (Compra compraAtual : compras) {
			total += compraAtual.obterValorTotal();
		}

		return total;

	}
}
