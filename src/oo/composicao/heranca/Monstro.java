package oo.composicao.heranca;

public class Monstro extends Jogador{
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY ==1) {
			oponente.life -=15; 
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.life -=1;
			return true;
		}else
		return false;
		
	}

}
