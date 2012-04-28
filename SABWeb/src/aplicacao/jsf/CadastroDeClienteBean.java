package aplicacao.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.repositorio.interfaces.remote.IRepositorioClientesRemote;

@ManagedBean
@RequestScoped

public class CadastroDeClienteBean {
	@EJB
	private IRepositorioClientesRemote repositorioCliente;
	
	
}
