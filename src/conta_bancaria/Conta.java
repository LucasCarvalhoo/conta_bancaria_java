package conta_bancaria;

import java.util.Scanner;

import javax.swing.DefaultRowSorter;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private double limiteSaque;
	
	public Conta(int numero, String titular, double saldo, double limiteSaque) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Conta() {
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(int valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saque(int valor) throws SaldoInsuficienteException, LimiteSaqueExcedidoException {
		if(valor > this.limiteSaque) {
			throw new LimiteSaqueExcedidoException();
		}
		if(valor > this.saldo) {
			throw new SaldoInsuficienteException();
		}
		this.saldo = this.saldo - valor;
	}

	@Override
	public String toString() {
		return "Conta [\nnumero = " + numero + "\ntitular = " + titular + "\nsaldo = " + saldo + "\nlimiteSaque = " + limiteSaque
				+ "\n]";
	}

	
	
}
