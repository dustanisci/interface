package model;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	/**
	 * Descri��o: M�todo defino na interface, interage com a CalcularImposto atrav�s
	 * de composi��o. Retorna de forma fixa o valor 100.
	 */
	@Override
	public double getValorImposto() {
		return 50;
	}

}