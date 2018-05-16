package model;

/**
 * Descri��o: Classe Conta abstrata destinada a ser superclasse. Quando n�o �
 * inserido o modificador no m�todo, automaticamente � recebido o default, o
 * qual n�o � vis�vel para as subclasses que a herdarem.
 */

public abstract class Conta {
	protected int numero;
	protected double saldo;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposita(double valorDeposito) {
		return this.saldo += valorDeposito;
	}
	
	public double saca(double valorSaca) {
		return this.saldo -= valorSaca;
	}
}