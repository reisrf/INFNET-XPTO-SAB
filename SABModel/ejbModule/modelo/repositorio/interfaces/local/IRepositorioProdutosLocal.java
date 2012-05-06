package modelo.repositorio.interfaces.local;

import java.util.List;

import javax.ejb.Local;

import modelo.Cliente;
import modelo.Produto;

@Local
public interface IRepositorioProdutosLocal {
	public List<Produto> buscarProdutosPorCliente(Cliente cliente);

	public void buscarProdutosPendentesDeAprovacao();

	void cadastrarProduto(Produto produto);

	int GerarNumeroConta();
}
