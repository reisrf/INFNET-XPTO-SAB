package modelo;

import javax.persistence.*;

@Entity
@Table
public class LimiteChequeEspecial extends Produto {
	
	public LimiteChequeEspecial() {
		super();
	}

	public String valor;

	@Override
	public String toString() {
		return "LimiteChequeEspecial [valor=" + valor + "]";
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
