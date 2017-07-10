package org.camunda.webservice;



import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;

import org.camunda.bpm.engine.ProcessEngine;


/*
 * This is a very simple JAX-WS SOAP web service that create a new
 * process instance in the Camunda engine. The WS accepts a string
 * parameter that is used to initialize a "name" process variable.
 */
@WebService
public class RicevutaRichiestaAcquirente {
	@Resource(mappedName = "java:global/camunda-bpm-platform/process-engine/default")
	private ProcessEngine processEngine;
	
	
	  
	  @Inject
	  private TaskService taskService;
	
	public static final String CALLBACK_URL = "callbackURL";
	public static final String CALLBACK_CORRELATION_ID = "callbackCorrelationId";
	public static final String PAYLOAD = "payload";
	
	private final static Logger LOGGER = Logger.getLogger(RicevutaRichiestaAcquirente.class.getName());
	
	// IO METTO A DISPOSIZIONE QUESTO WEB SERVICE ALL'ACQUIRENTE PER FARMI CHIAMARE
	// prende i seguenti parametri: 
	// - il processo da avviare 
	// - un URL da richiamare indietro quando il processo e completato 
	// - Un ID di correlazione per identificare l'istanza del processo da richiamare
	// - payload 
	public void invokeProcess(String processDefinitionKey, String callbackUrl, String correlationId, @WebParam(name="richiesta") String payload) {
		LOGGER.info("l'ID del processo chiamante - lato web service - (acquirente) e: " + correlationId); 
	    Map<String, Object> variables = new HashMap<String, Object>();
	    variables.put("callbackURL", callbackUrl);
	    variables.put("callbackCorrelationId", correlationId);
	    variables.put("richiesta", payload); // in questo caso sara il nostro valore del form "richiesta" 
	    processEngine.getRuntimeService().startProcessInstanceByKey(processDefinitionKey, variables);
	  }
	
	// TaskDto
	  /*public List<String> getTaskList(List<String> correlationIds) {
	    ArrayList<String> tasks = new ArrayList<String>();
	    // Better than the loop would be to introduce an own query doing this in one SQL, see
	    // https://app.camunda.com/confluence/display/foxUserGuide/Performance+Tuning+with+custom+Queries
	    for (String id : correlationIds) {      
	      List<Task> tasksForCorrelationId = taskService.createTaskQuery().processVariableValueEquals("callbackCorrelationId", id).list();
	      for (Task task : tasksForCorrelationId) {        
	        tasks.add(task.getName());
	                //new TaskDto(task.getName(), task.getDescription(), task.getAssignee(), task.getId(), task.getProcessInstanceId(), task.getExecutionId(), task.getProcessDefinitionId()));
	      }
	    }
	    return tasks;
	  }
	*/
	
	
}