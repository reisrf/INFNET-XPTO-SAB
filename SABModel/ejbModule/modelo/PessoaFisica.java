package modelo;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PessoaFisica extends Cliente {

	@NotNull
	public String login;
	@NotNull
	public String senha;
	@NotNull
	public String cpf;
	@NotNull
	public String nome;
	@NotNull
	public String renda;
	@NotNull
	public char sexo;
	@NotNull
	public Date dataNascimento;
	public List<Dependente> dependentes;
	@Embedded
	public Endereco endereco;

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", renda="
				+ renda + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", dependentes=" + dependentes + "]";
	}

	public PessoaFisica(String nome, String cpf, String renda, char sexo,
			Date datanascimento, String login, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.renda = renda;
		this.sexo = sexo;
		this.dataNascimento = datanascimento;
		this.login = login;
		this.senha = senha;
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

	public String getRenda() {
		return renda;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
