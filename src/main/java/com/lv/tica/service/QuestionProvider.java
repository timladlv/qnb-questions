package com.lv.tica.service;

import java.util.ArrayList;
import java.util.List;

import com.lv.tica.service.webtx.NewQuotingRequest;

public class QuestionProvider {

	public List<String> getQuestions(NewQuotingRequest request) {
		List<String> questions = new ArrayList<String>();
		if (request.getPageId() % 2 == 0) {
			questions.add("what's your vrn?");
		} else {
			questions.add("what's your name?");
		}
		return questions;
	}
}
