package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();

	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));

	}

	void adicionarItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}

}

// Compras recebe uma lista de itens.
// Metodo para adicionar os itens a compra.
// valor total de todos os itens adicionados a lista de itens de uma compra.