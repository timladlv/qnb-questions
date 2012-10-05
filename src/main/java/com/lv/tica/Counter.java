package com.lv.tica;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;

public interface Counter {

	@ManagedAttribute
	@ManagedMetric
	public abstract int getCounter();

}