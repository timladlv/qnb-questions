package com.lv.tica.service;

import java.util.List;

public class ProvidedAnswers {
	
	private WebTransactionContext ctx;
	private List<String> answers;
	
	public WebTransactionContext getCtx() {
		return ctx;
	}
	public void setCtx(WebTransactionContext ctx) {
		this.ctx = ctx;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

}
