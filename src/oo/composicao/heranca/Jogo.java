package oo.composicao.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		
		Heroi j1 = new Heroi();
		j1.x = 10;
		j1.y = 20;
		
		Monstro j2 = new Monstro();
		j2.x = 10;
		j2.y = 21;
		
		System.out.println(j1.life);
		System.out.println(j2.life);
		
		j1.atacar(j2);
		j1.atacar(j2);
		System.out.println(j2.life);
		System.out.println(j1.life);
	}

}
