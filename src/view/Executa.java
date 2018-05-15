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
		
//		mostra o valor total de imposto, conforme a interface + composição
		System.out.println(imposto.getTotalImposto());
		
//		seto o imposto em cima do saldo
		cc.deposita(imposto.getTotalImposto());
		
//		imprimo o saldo
		System.out.println(cc.getSaldo());
		
	}
}
