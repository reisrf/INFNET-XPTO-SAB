package modelo.repositorio;

import javax.ejb.Stateless;
import javax.persistence.*;
import modelo.Cliente;
import modelo.repositorio.interfaces.local.IRepositorioClientesLocal;
import modelo.repositorio.interfaces.remote.IRepositorioClientesRemote;

@Stateless
public class RepositorioClientes implements IRepositorioClientesLocal,
		IRepositorioClientesRemote {
	//@PersistenceContext
	//private EntityManager em;

	@Override
	public void cadastrarCliente(Cliente cliente) {

	}
}
