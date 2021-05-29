package oo.composicao;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Junior Ribeiro");
		Compra compra = new Compra();
		
		compra.adicionarItem("Notebook", 10.000, 1);
		compra.adicionarItem(new Produto("Cadeira Gamer", 8.000),1);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Mesa Escritorio", 2.000, 1);
		compra1.adicionarItem(new Produto("Monitor LED", 5.000),1);
		
		cliente.adicionarCompra(compra);
		cliente.compras.add(compra1);
		System.out.printf("Cliente %s, comprou %2f ", cliente.nome, cliente.obterValorTotal());
	
	}

}
