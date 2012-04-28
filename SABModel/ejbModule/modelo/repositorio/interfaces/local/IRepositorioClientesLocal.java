package modelo.repositorio.interfaces.local;

import javax.ejb.Local;

import modelo.Cliente;

@Local
public interface IRepositorioClientesLocal {
	public void cadastrarCliente(Cliente cliente);
}
