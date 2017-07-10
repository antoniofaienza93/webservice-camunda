package org.camunda.webservice;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.EventSubscription;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import org.camunda.bpm.BpmPlatform;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;

@WebService
public class RispondiAdAcquirente {
	
	//@Resource(mappedName = "java:global/camunda-bpm-platform/process-engine/default")
	//private ProcessEngine processEngine;*/
	@Inject
	private RuntimeService runtimeService;
	
	
	public static final String PAYLOAD_RECEIVED_FROM_CALLBACK = "payloadReceivedFromCallback";
	
	
	private final static Logger LOGGER = Logger.getLogger(RispondiAdAcquirente.class.getName());
	// questa cosa parte quando viene ricevuta la richiesta da parte dell'acquirente. Corrisponde ad un throw message start event 
	
	
	
	// QUESTO E' IL WEB SERVICE DI ACQUIRENTE. LO ESPONGO AD ACQUIRENTE 
	// prende tre parametri: 
	// il processo che e stato chiamato e quindi che e stato terminato, 
	// il CorrelationID che e stato assegnato al suddetto processo
	// il payload che nel nostro caso sara il valore di review.
	@WebMethod
	public void invokeProcessCallback(String calledProcess, String correlationId, String payload) throws SOAPException {
		
			LOGGER.info("processoChiamato " + calledProcess);
			LOGGER.info("correlationID " + correlationId);
			LOGGER.info("payload " + payload);
			LOGGER.info("non mi piace quell execution " + payload);
			
			Execution execution = runtimeService
			        .createExecutionQuery()
			        .variableValueEquals(calledProcess, correlationId) // seleziona il processo che e stato completato con il relativo ID 
			        .singleResult();

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put("risposta-richiesta", payload); // payload che sara rispedito al mittente 
			//runtimeService.signal(execution.getId(), variables);
			runtimeService.signal(execution.getId(), variables);
	    
	  }
	
	
	
	@WebMethod
	public void prova2(@WebParam(name="processoDaIniziare") String processoDaIniziare, 
						@WebParam(name="id") String IDdelProcesso,
						@WebParam(name="messageName") String messageName
						){
		ProcessInstance pi = runtimeService.startProcessInstanceByKey(processoDaIniziare);

		EventSubscription subscription = runtimeService.createEventSubscriptionQuery()
		  .processInstanceId(pi.getId()).eventType("message").singleResult();

		//runtimeService.messageEventReceived(messageName, IDdelProcesso);
		runtimeService.messageEventReceived(messageName, IDdelProcesso);
	}
	
	@WebMethod
	public void prova3(@WebParam(name="processo") String processo, @WebParam(name="id") String id){
		ProcessInstance pi = runtimeService.startProcessInstanceByKey(processo); // in realta e acquirente 
		Execution execution =runtimeService.createExecutionQuery()
		  .processInstanceId(pi.getId()).activityId("risp-acme-id").singleResult();

		//runtimeService.signal(execution.getId());
		runtimeService.signal(id);
	}
	
	@WebMethod
	public void prova4(@WebParam(name="messaggio") String m){
		
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("risposta-richiesta", "ciao"); // payload che sara rispedito al mittente 
		runtimeService.createMessageCorrelation(m)
		  .setVariables(variables)
		  .correlateWithResult();

		//runtimeService.signal(execution.getId());
		//runtimeService.signal(id);
	}
	
	@WebMethod
	public void prova5(@WebParam(name="messaggio") String m){		

		ProcessEngine processEngine = BpmPlatform.getDefaultProcessEngine();
		processEngine.getRuntimeService().correlateMessage(m);
	}
	
	
	
	
	
}
	

