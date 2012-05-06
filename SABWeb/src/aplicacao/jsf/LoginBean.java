package aplicacao.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.repositorio.interfaces.remote.IRepositorioClientesRemote;
import modelo.repositorio.interfaces.remote.IRepositorioLoginRemote;

@ManagedBean
@RequestScoped
public class LoginBean {
	@EJB
	private IRepositorioLoginRemote repositorioLogin;

	public String login;
	public String senha;

	public String logar() {
		return repositorioLogin.logar(this.login, this.senha);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
