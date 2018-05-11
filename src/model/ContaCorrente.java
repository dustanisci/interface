package model;

import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

	@Override
	public double getValorImposto() {
		return 100;
	}
		
}