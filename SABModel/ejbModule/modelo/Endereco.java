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
	public String bairro;
	@NotNull
	public String cidade;
	@NotNull
	public String estado;
	@NotNull
	public String cep;

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + ", cep=" + cep + "]";
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
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
