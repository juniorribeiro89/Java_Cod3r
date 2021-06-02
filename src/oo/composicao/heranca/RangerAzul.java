package oo.composicao.heranca;

 /**
 * @author Junior
 * A class Hero extends as caracteristicas da class jogador
 * 	O RangerAzul teve os metodos todos copiados da classe jogador usando o extends.
 *
 */
public class RangerAzul extends Jogador{
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY ==1) {
			oponente.life -=10; 
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.life -=1;
			return true;
		}else
		return false;
		
	}

}
