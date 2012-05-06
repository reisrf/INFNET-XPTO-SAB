package modelo.repositorio.interfaces.remote;

import javax.ejb.Remote;

@Remote
public interface IRepositorioLoginRemote {
	String logar(String login, String senha);
}
