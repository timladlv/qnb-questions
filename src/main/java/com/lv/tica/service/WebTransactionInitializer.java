package com.lv.tica.service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.lv.tica.service.webtx.NewQuotingRequest;

public class WebTransactionInitializer {
	
	private Map<UUID, WebTransactionContext> contextMap = new ConcurrentHashMap<UUID, WebTransactionContext>();
	
	public WebTransactionContext createWebTransactionContext(NewQuotingRequest request) {
		WebTransactionContext ctx = new WebTransactionContext();
		ctx.setCurrentPage(request.getPageId());
		ctx.setRequestType(request.getRequestType());
		UUID randomUUID = UUID.randomUUID();
		ctx.setUuid(randomUUID);
		ctx.setDateCreated(new Date());
		contextMap.put(randomUUID, ctx);
		return ctx;
	}

}
