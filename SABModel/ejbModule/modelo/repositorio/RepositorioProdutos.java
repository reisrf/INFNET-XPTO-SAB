package modelo.repositorio;

import javax.ejb.Stateless;
import javax.persistence.*;
import modelo.Cliente;
import modelo.repositorio.interfaces.local.IRepositorioProdutosLocal;
import modelo.repositorio.interfaces.remote.IRepositorioProdutosRemote;

@Stateless
public class RepositorioProdutos implements IRepositorioProdutosLocal,
		IRepositorioProdutosRemote {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void buscarProdutosPorCliente(Cliente cliente) {

	}

	@Override
	public void buscarProdutosPendentesDeAprovacao() {

	}
}
