package model;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	/**
	 * Descrição: Método defino na interface, interage com a CalcularImposto através
	 * de composição. Retorna de forma fixa o valor 100.
	 */
	@Override
	public double getValorImposto() {
		return 50;
	}

}