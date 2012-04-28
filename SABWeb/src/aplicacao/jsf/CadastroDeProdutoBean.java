package aplicacao.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.repositorio.interfaces.remote.IRepositorioProdutosRemote;

@ManagedBean
@RequestScoped

public class CadastroDeProdutoBean {
	@EJB
	private IRepositorioProdutosRemote repositorioProduto;

}
