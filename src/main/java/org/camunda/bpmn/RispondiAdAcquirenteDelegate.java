package org.camunda.bpmn;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.ProcessEngineService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.EventSubscription;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import cxf.org.camunda.webservice.ame.RispondiAdAcquirente;
import cxf.org.camunda.webservice.ame.RispondiAdAcquirenteService;






public class RispondiAdAcquirenteDelegate implements JavaDelegate {
	
	private ProcessEngine processEngine;
	
	
	private final static Logger LOGGER = Logger.getLogger(RispondiAdAcquirenteDelegate.class.getName());
	
	public void execute(DelegateExecution execution) throws Exception {
		
		RispondiAdAcquirenteService richiedoServizioAdAcme = new RispondiAdAcquirenteService();  // questo � ottenuto dal wsdl del servizio che fornisce l'interfaccia 
		RispondiAdAcquirente richiesta = richiedoServizioAdAcme.getRispondiAdAcquirentePort();
		
		LOGGER.info("VEDIAMO LE VARIABILI CHE ARRIVANO AL JAVA DELEGATE: ");
		LOGGER.info("--> " + execution.getVariable("richiesta"));
		LOGGER.info("--> " + execution.getVariable("callbackCorrelationId"));
		
		
		
		/*richiesta.rispondiAdAcquirente((String) execution.getVariable("richiesta"), 
										(String) execution.getVariable("EXECUTION_ID"),
										(String) execution.getVariable("CHIAVE"));*/
		// facciamo restore delle informazioni
		String processoChiamato = "acme-processo";
		String payloadpassato = (String) execution.getVariable("richiesta"); // prendo la variabile del form
																			 // all'interno di richiesta
		String correlationId = (String) execution.getVariable("CALLBACK_CORRELATION_ID");
		
		execution.setVariable("demo", execution.getVariable("richiesta"));	
		richiesta.invokeProcessCallback(processoChiamato, correlationId, payloadpassato);
		
		
		
		
	}

	
	
	
}