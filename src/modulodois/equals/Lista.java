package modulodois.equals;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
	
		ArrayList<UsuarioLista> lista = new ArrayList<UsuarioLista>();
		
		UsuarioLista u1 = new UsuarioLista("Junior"); //form one instance 
		lista.add(u1);
		lista.add(new UsuarioLista("Junior Ribeiro")); //form two instance
		lista.add(new UsuarioLista("Ribeiro")); 
		lista.add(new UsuarioLista("Sistemas")); 
		lista.add(new UsuarioLista("ROV"));
		
		System.out.println(lista.get(4));
		lista.remove(2);
		System.out.println(lista.remove(new UsuarioLista("Sistemas")));
		
		for (UsuarioLista usuarioLista : lista) {
			System.out.println(usuarioLista);
		}
		

	}

}
