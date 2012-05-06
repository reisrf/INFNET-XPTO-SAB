package aplicacao.jsf;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.jboss.resteasy.util.DateUtil;

import modelo.Endereco;
import modelo.PessoaFisica;
import modelo.Cliente;
import modelo.repositorio.interfaces.remote.IRepositorioClientesRemote;

@ManagedBean
@RequestScoped
public class CadastroDeClienteBean {
	@EJB
	private IRepositorioClientesRemote repositorioCliente;

	public String nome;
	public String cpf;
	public String renda;
	public char sexo;
	public String login;
	public String senha;
	public String logradouro;
	public String complemento;
	public String estado;
	public String cidade;
	public String cep;
	public Date dataNascimento;

	public String cadastrar() {

		Cliente cliente = new PessoaFisica(nome, cpf, renda, sexo,
				dataNascimento, login, senha);
		Endereco endereco = new Endereco(logradouro, complemento, cidade,
				estado, cep);
		cliente.setEndereco(endereco);
		try {
			repositorioCliente.cadastrarCliente(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			FacesMessage msg = new FacesMessage(e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, msg);

			return null;
		}

		return "sucessocliente";
	}

	public List<Cliente> ListarClientes() {
		return repositorioCliente.ListarClientes();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
