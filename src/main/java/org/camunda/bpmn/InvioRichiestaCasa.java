package org.camunda.bpmn;


import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.webservice.RicevutaRichiestaAcquirente;

import cxf.org.camunda.webservice.ame.RicevutaRichiestaAcquirenteService;








public class InvioRichiestaCasa implements JavaDelegate {

 
	private final static Logger LOGGER = Logger.getLogger(InvioRichiestaCasa.class.getName());

	
	 
	public void execute(DelegateExecution execution) throws Exception {
		//LOGGER.info("Processing request by '" + execution.getVariable("richiestaId") + "'...");
		// qui viene generato il servizio di acme generato con il wsdl
		
		
		RicevutaRichiestaAcquirenteService richiedoServizioAdAcme = new RicevutaRichiestaAcquirenteService();  // questo � ottenuto dal wsdl del servizio che fornisce l'interfaccia 
		RicevutaRichiestaAcquirente richiesta =  (RicevutaRichiestaAcquirente) richiedoServizioAdAcme.getRicevutaRichiestaAcquirentePort();		
		
		
		LOGGER.info("ID del processo chiamante (acquirente) " + execution.getId());
		// store del nostro payload
		execution.setVariable("richiesta", (String)execution.getVariable("richiesta"));
		String callbackURL = "URL_" + (String)execution.getVariable("richiesta");
		String correlationID = (String) execution.getId();
		execution.setVariable("CORRELATION_ID_PREFIX ", correlationID);
		// andiamo ad instanziare il processo da chiamare: 
		richiesta.invokeProcess("acme-processo-id", callbackURL , correlationID , (String)execution.getVariable("richiesta"));
  }

}