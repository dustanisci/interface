package view;

import model.CalcularImposto;
import model.ContaCorrente;
import model.SeguroDeVida;

public class Executa {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);

		SeguroDeVida seguro = new SeguroDeVida();

		CalcularImposto imposto = new CalcularImposto();
		imposto.setTotalImposto(cc);
		imposto.setTotalImposto(seguro);

		// Exibição do valor total de imposto
		// conforme a interface e a composição
		System.out.println(imposto.getTotalImposto());

		// Valor do imposto
		cc.setImposto(imposto.getTotalImposto());

		// Imprimo o saldo
		System.out.println(cc.getSaldo());

	}
}
