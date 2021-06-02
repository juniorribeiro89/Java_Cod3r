package oo.composicao.heranca;


/**
 * @author Junior
 * 
 * O rangerVermelho teve os metodos sobre escritos mas usando a fun��o super para a 
 * jogador.
 * com incrementa��o de 2 ataques.
 *
 */
public class RangerVermelho  extends Jogador{
	
	boolean atacar(Jogador oponente) {
		boolean soco = super.atacar(oponente);
		boolean chute = super.atacar(oponente);
		boolean chuteAlto = super.atacar(oponente);
		return soco || chute || chuteAlto;
	}
}
