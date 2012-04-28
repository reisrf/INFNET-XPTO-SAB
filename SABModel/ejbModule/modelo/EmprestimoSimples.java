package modelo;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EmprestimoSimples extends Produto {
	public String valorTotal;
	public String quantidadePrestacoes;
	public String valorPrestacoes;

	@Override
	public String toString() {
		return "EmprestimoSimples [valorTotal=" + valorTotal
				+ ", quantidadePrestacoes=" + quantidadePrestacoes
				+ ", valorPrestacoes=" + valorPrestacoes + "]";
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getQuantidadePrestacoes() {
		return quantidadePrestacoes;
	}

	public void setQuantidadePrestacoes(String quantidadePrestacoes) {
		this.quantidadePrestacoes = quantidadePrestacoes;
	}

	public String getValorPrestacoes() {
		return valorPrestacoes;
	}

	public void setValorPrestacoes(String valorPrestacoes) {
		this.valorPrestacoes = valorPrestacoes;
	}

}
