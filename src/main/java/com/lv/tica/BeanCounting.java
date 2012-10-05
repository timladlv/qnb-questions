package com.lv.tica;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName="com.lv.tica:type=BeanCounting")
public class BeanCounting implements Counter {
	
	private AtomicInteger counter = new AtomicInteger(0);
	
	public String echoUpper(String input) {
		counter.incrementAndGet();
		return input.toUpperCase();
	}
	
	/* (non-Javadoc)
	 * @see com.lv.tica.Counter#getCounter()
	 */
	@Override
	@ManagedAttribute
	@ManagedMetric
	public int getCounter() {
		return counter.get();
	}
	
	@ManagedOperation(description="foo")
	public void resetCounter() {
		counter.set(0);
	}

}
