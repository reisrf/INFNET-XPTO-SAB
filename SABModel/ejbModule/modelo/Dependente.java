package modelo;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Dependente {
	@NotNull
	public String cpf;
	@NotNull
	public String nome;
	@NotNull
	public Date dataNascimento;

	@Override
	public String toString() {
		return "Dependente [cpf=" + cpf + ", nome=" + nome
				+ ", dataNascimento=" + dataNascimento + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
