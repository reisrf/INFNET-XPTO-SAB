package modelo.repositorio.interfaces.local;

import javax.ejb.Local;

@Local
public interface IRepositorioLoginLocal {

	String logar(String login, String senha);

}
