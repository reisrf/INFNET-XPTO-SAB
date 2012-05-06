package modelo.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import modelo.Cliente;
import modelo.Produto;
import modelo.repositorio.interfaces.local.IRepositorioProdutosLocal;
import modelo.repositorio.interfaces.remote.IRepositorioProdutosRemote;

@Stateless
public class RepositorioProdutos implements IRepositorioProdutosLocal,
		IRepositorioProdutosRemote {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Produto> buscarProdutosPorCliente(Cliente c) {

		Query query = em
				.createQuery("SELECT p FROM Produto Where p.cliente.id = ?");
		query.setParameter(1, c.getId());
		Produto produto = null;

		try {
			produto = (Produto) query.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return (List<Produto>) produto;
	}

	public int GerarNumeroConta() {
		Query query = em.createQuery("SELECT Max(p.numero) FROM Produto");

		int numeroConta = 0;

		try {
			numeroConta = query.getMaxResults();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return numeroConta;

	}

	@Override
	public void buscarProdutosPendentesDeAprovacao() {

	}

	@Override
	public void cadastrarProduto(Produto produto) {
		em.persist(produto);
	}

}
