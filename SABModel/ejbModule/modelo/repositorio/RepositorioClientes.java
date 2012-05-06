package modelo.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import modelo.Cliente;
import modelo.repositorio.interfaces.local.IRepositorioClientesLocal;
import modelo.repositorio.interfaces.remote.IRepositorioClientesRemote;

@Stateless
public class RepositorioClientes implements IRepositorioClientesLocal,
		IRepositorioClientesRemote {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void cadastrarCliente(Cliente cliente) {
		em.persist(cliente);
	}

	@Override
	public List<Cliente> ListarClientes() {

		Query query = em.createQuery("SELECT c FROM Cliente c");

		Cliente cliente = null;

		try {
			cliente = (Cliente) query.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return (List<Cliente>) cliente;
	}

}
