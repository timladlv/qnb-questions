package com.lv.tica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lv.tica.service.QuestionGenerationGateway;
import com.lv.tica.service.QuestionProvider;

@ContextConfiguration(locations= {"classpath:META-INF/spring/integration/spring-integration-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestQuestionGeneration {
	
	@Autowired
	QuestionGenerationGateway gateway;
	
	@Test
	public void testNameTransaction() {
		assertEquals(QuestionProvider.NAME_QUESTION, invokeQuestionGateway(1));
	}

	@Test
	public void testVrnTransaction() {
		assertEquals(QuestionProvider.VRN_QUESTION, invokeQuestionGateway(2));
	}

	private String invokeQuestionGateway(int pageId) {
		String requestType = "LV-desktop";
		String jsonRequestPayload = String.format("{ \"pageId\":\"%d\", \"requestType\":\"%s\"}", pageId, requestType);
		List<String> questions = gateway.generateQuestions(jsonRequestPayload);
		assertNotNull(questions);
		assertEquals(1, questions.size());
		return questions.get(0);
	}
	
}
