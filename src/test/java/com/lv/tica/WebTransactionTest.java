package com.lv.tica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lv.tica.service.WebTransactionContext;
import com.lv.tica.service.WebTransactionGateway;

@ContextConfiguration(locations= {"classpath:META-INF/spring/integration/spring-integration-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebTransactionTest {
	
	@Autowired
	WebTransactionGateway gateway;
	
	@Test
	public void testWebTransaction() {
		int pageId = 200;
		String requestType = "LV-desktop";
		String jsonRequestPayload = String.format("{ \"pageId\":\"%d\", \"requestType\":\"%s\"}", pageId, requestType);
		WebTransactionContext ctx = gateway.initialize(jsonRequestPayload);
		assertEquals(pageId, ctx.getCurrentPage());
		assertEquals(requestType, ctx.getRequestType());
		assertNotNull(ctx.getUuid());
		assertNotNull(ctx.getDateCreated());
	}

}
