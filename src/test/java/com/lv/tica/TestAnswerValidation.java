package com.lv.tica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lv.tica.service.AnswerProcessingGateway;
import com.lv.tica.service.CorrectAnswerHandler;

@ContextConfiguration(locations= {"classpath:META-INF/spring/integration/spring-integration-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAnswerValidation {
	
	@Autowired
	AnswerProcessingGateway gateway;

	@Test
	public void correctAnswersProvided() {
		String requestType = "LV-desktop";
		int pageId = 1;
		String jsonRequestPayload = String.format("{ \"pageId\":\"%d\", \"requestType\":\"%s\", \"answers\":[\"MG55CAR\"]}", pageId , requestType);
		assertEquals(CorrectAnswerHandler.VALID_ANSWERS, gateway.checkAnswers(jsonRequestPayload));
	}
	
}
