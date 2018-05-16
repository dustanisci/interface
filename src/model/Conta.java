package model;

/**
 * Descrição: Classe Conta abstrata destinada a ser superclasse. Quando não é
 * inserido o modificador no método, automaticamente é recebido o default, o
 * qual não é visível para as subclasses que a herdarem.
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