package modelo.repositorio.interfaces.remote;

import java.util.List;

import javax.ejb.Remote;

import modelo.Cliente;

@Remote
public interface IRepositorioClientesRemote {
	public void cadastrarCliente(Cliente cliente);

	List<Cliente> ListarClientes();
}
