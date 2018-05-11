package model;
public abstract class Conta {
	protected int numero;
	protected double saldo;
	
/*
 
 	caso nao declare o modificador no metodo em uma classe abstrata
 	automaticamente sao abstratos e o modificador ficara do tipo  default,
 	ou seja, não e' visivel para os filhos.
 	
 */

		
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
/**
 * Este metodo realiza deposito de valor.
 * @param valorDeposito
 * @return
 */
	public double deposita(double valorDeposito) {
		return this.saldo += valorDeposito;
	}
	
/**
 * Este metodo realiza saque de valor.
 * @param valorSaca
 * @return
 */
	public double saca(double valorSaca) {
		return this.saldo -= valorSaca;
	}
}