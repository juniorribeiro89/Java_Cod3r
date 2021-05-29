package oo.composicao;

public class Item {
	
	Produto produto;
	int quantidade;
	
	// Os itens esperam um produto como parametro.
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
