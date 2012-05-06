package modelo.repositorio.interfaces.local;

import java.util.List;

import javax.ejb.Local;

import modelo.Cliente;

@Local
public interface IRepositorioClientesLocal {
	public void cadastrarCliente(Cliente cliente);

	List<Cliente> ListarClientes();
}
