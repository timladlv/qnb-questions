package com.lv.tica.service;

import java.util.ArrayList;
import java.util.List;

import com.lv.tica.service.webtx.NewQuotingRequest;

public class QuestionProvider {

	public static String VRN_QUESTION = "what's your vrn?";
	public static String NAME_QUESTION = "what's your name?";
	
	public List<String> getQuestions(NewQuotingRequest request) {
		List<String> questions = new ArrayList<String>();
		if (request.getPageId() % 2 == 0) {
			questions.add(VRN_QUESTION);
		} else {
			questions.add(NAME_QUESTION);
		}
		return questions;
	}
	
}
