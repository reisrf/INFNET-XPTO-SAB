package modelo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ContaCorrente extends Produto {
	@NotNull
	public String numero;
	@NotNull
	public String saldo;

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

}
