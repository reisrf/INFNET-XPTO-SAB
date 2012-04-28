package modelo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class PessoaJuridica extends Cliente {
	@NotNull
	public String cnpj;
	@NotNull
	public String razaoSocial;
	@NotNull
	public String faturamento;

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial
				+ ", faturamento=" + faturamento + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(String faturamento) {
		this.faturamento = faturamento;
	}

}
