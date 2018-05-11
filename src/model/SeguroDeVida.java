package model;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double getValorImposto() {
		return 50;
	}

}