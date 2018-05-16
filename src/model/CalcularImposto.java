package model;

import interfaces.Tributavel;

public class CalcularImposto {

	private double totalImposto;

	public void setTotalImposto(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}

	public double getTotalImposto() {
		return totalImposto;
	}

}