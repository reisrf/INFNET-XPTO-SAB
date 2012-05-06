package modelo;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ContaSalario extends ContaCorrente {

	public ContaSalario(int numero, String saldo) {
		super(numero, saldo);
	}
}
