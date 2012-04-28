package aplicacao.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.Produto;
import modelo.servico.ServicoContratacao;

@ManagedBean
@RequestScoped
public class ContratarProdutoBean {
	@EJB
	private ServicoContratacao contratarProduto;

	public String ContratarProduto() {
		contratarProduto.solicitarContratacao(null, null);
		return null;
	}

	public String AprovarContratacaoProduto() {
		contratarProduto.aprovarContratacao(null, null);
		return null;
	}

}
