package oo.composicao.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		
		RangerAzul rangeAzul = new RangerAzul();
		rangeAzul.x = 10;
		rangeAzul.y = 21;
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 20;
		
		System.out.println("Vida Heroi->" + rangeAzul.life);
		System.out.println("Vida Monstro->" + monstro.life);
		
		rangeAzul.atacar(monstro);
		rangeAzul.atacar(monstro);
		monstro.atacar(rangeAzul);
		monstro.atacar(rangeAzul);
		System.out.println(monstro.life);
		System.out.println(rangeAzul.life);
	}

}
