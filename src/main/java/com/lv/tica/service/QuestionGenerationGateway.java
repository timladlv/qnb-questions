package com.lv.tica.service;

import java.util.List;

public interface QuestionGenerationGateway {
	
	List<String> generateQuestions(String jsonPayload);

}
