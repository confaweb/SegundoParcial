package ar.edu.unlam.Dominio;

import ar.edu.unlam.Exception.FraudeException;

public interface Rechazable {
	
	public Boolean monitorear() throws FraudeException;

}
