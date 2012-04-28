package modelo.repositorio.interfaces.remote;

import javax.ejb.Remote;

import modelo.Cliente;

@Remote
public interface IRepositorioProdutosRemote {
	public void buscarProdutosPorCliente(Cliente cliente);

	public void buscarProdutosPendentesDeAprovacao();

}
