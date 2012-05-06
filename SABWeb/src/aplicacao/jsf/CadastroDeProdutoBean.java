package aplicacao.jsf;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Endereco;
import modelo.PessoaFisica;
import modelo.Produto;
import modelo.Produto.Status;
import modelo.repositorio.interfaces.remote.IRepositorioProdutosRemote;

@ManagedBean
@RequestScoped
public class CadastroDeProdutoBean {
	@EJB
	private IRepositorioProdutosRemote repositorioProduto;

	private int numero;
	private String saldo;
	public Produto.TipoProduto tipo;

	public String cadastrar() {
		Produto produto = null;
		numero = 0;
		numero = repositorioProduto.GerarNumeroConta();
		if (this.tipo == Produto.TipoProduto.CONTACORRENTE) {
			produto = new ContaCorrente(numero, saldo);
		} else {
			produto = new ContaPoupanca(numero, saldo);
		}
		produto.status = Status.ATIVO;
		produto.tipo = this.tipo;
		try {
			repositorioProduto.cadastrarProduto(produto);
		} catch (Exception e) {
			e.printStackTrace();
			FacesMessage msg = new FacesMessage(e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, msg);
			return null;
		}

		return "sucessoproduto";
	}

	public Produto.TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(Produto.TipoProduto tipo) {
		this.tipo = tipo;
	}

}
