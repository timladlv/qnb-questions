package com.lv.tica;

import java.io.Serializable;

public class Vehicle implements Serializable {
	
	private static final long serialVersionUID = 6315578237616841945L;

	String vrn;
	String description;

	public String getVrn() {
		return vrn;
	}

	public void setVrn(String vrn) {
		this.vrn = vrn;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
