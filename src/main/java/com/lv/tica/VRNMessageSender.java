package com.lv.tica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.webflow.action.FormAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

public class VRNMessageSender extends FormAction {
	
	@Autowired
	private MessageChannel vrnInput;
	
	@Autowired
	private PollableChannel vrnLookupEventChannel;
	
	public Event sendMessage(Vehicle v) {
		Message<String> message = MessageBuilder.withPayload(v.getVrn()).build();
		vrnInput.send(message);
		Message<?> vrnMessage = vrnLookupEventChannel.receive(0);
		Event e = null;
		String vehicleDesc = (String) vrnMessage.getPayload();
		System.out.println("received: " + vehicleDesc);
		v.setDescription(vehicleDesc);
		if ("".equals(vehicleDesc)) {
			System.out.println("missing event");
			e = new Event(vehicleDesc, "missing");
		} else {
			System.out.println("found event");
			e = new Event(vehicleDesc, "found");
		}
		return e;
	}


}
