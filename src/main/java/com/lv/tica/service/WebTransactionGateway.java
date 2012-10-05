package com.lv.tica.service;

public interface WebTransactionGateway {
	
	WebTransactionContext initialize(String jsonPayload);
}
