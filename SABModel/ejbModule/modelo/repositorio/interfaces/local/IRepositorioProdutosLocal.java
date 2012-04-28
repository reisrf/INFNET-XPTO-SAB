package modelo.repositorio.interfaces.local;

import javax.ejb.Local;

import modelo.Cliente;

@Local
public interface IRepositorioProdutosLocal {
	public void buscarProdutosPorCliente(Cliente cliente);

	public void buscarProdutosPendentesDeAprovacao();

}
