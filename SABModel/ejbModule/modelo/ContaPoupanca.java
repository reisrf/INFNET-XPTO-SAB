package modelo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ContaPoupanca extends Produto {
	@NotNull
	public int numero;
	@NotNull
	public String saldo;

	@Override
	public String toString() {
		return "ContaPoupanca [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public ContaPoupanca(int numero, String saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

}
