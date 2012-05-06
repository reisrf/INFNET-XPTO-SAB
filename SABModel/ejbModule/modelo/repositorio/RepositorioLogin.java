package modelo.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Cliente;
import modelo.repositorio.interfaces.local.IRepositorioClientesLocal;
import modelo.repositorio.interfaces.local.IRepositorioLoginLocal;
import modelo.repositorio.interfaces.remote.IRepositorioClientesRemote;
import modelo.repositorio.interfaces.remote.IRepositorioLoginRemote;

@Stateless
public class RepositorioLogin implements IRepositorioLoginLocal,
		IRepositorioLoginRemote {

	@PersistenceContext
	private EntityManager em;

	@Override
	public String logar(String login, String senha) {
		String msg = null;
		Query query = em
				.createQuery("SELECT l FROM Login l where l.login = ? and l.senha = ?");
		query.setParameter(1, login);
		query.setParameter(2, senha);

		try {
			if (query.getFirstResult() == 1) {
				msg = "sucessologin";
			} else
				msg = "falhalogin";

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return msg;
	}
}
