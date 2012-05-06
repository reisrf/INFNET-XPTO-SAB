package modelo.repositorio.interfaces.remote;

import java.util.List;

import javax.ejb.Remote;

import modelo.Cliente;
import modelo.Produto;

@Remote
public interface IRepositorioProdutosRemote {
	public List<Produto> buscarProdutosPorCliente(Cliente cliente);

	public void buscarProdutosPendentesDeAprovacao();

	void cadastrarProduto(Produto produto);

	int GerarNumeroConta();
}
