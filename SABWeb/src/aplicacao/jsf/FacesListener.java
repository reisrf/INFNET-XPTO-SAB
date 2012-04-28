package aplicacao.jsf;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class FacesListener implements PhaseListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String[] VIEWS = {"/principal.xhtml"};
	
	@Override
	public void beforePhase(PhaseEvent event) {
		
	}

	@Override
	public void afterPhase(PhaseEvent event) {
		
		/*
		FacesContext facesContext = event.getFacesContext();
		String viewAtual = facesContext.getViewRoot().getViewId();
		System.out.println("###: " + viewAtual);
		
		HttpSession sessao = (HttpSession) facesContext.getExternalContext().getSession(true);
		Object clienteLogado = sessao.getAttribute("clienteLogado");

		for(int i = 0; i < VIEWS.length; i++){
			
			if(viewAtual.equals(VIEWS[i]) && clienteLogado == null){
				
				NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
				nh.handleNavigation(facesContext, null, "login");
				
				break;
			}
		}
		*/
	}

	@Override
	public PhaseId getPhaseId() {		
		return PhaseId.RESTORE_VIEW; 
	}

	public static String[] getViews() {
		return VIEWS;
	}

}
