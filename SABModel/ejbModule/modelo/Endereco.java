package modelo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Endereco {
	@NotNull
	public String logradouro;
	public String complemento;
	@NotNull
	public String cidade;
	@NotNull
	public String estado;
	@NotNull
	public String cep;

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", complemento="
				+ complemento + ", cidade=" + cidade + ", estado=" + estado
				+ ", cep=" + cep + "]";
	}

	public Endereco(String logradouro, String complemento, String cidade,
			String estado, String cep) {
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;

	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
