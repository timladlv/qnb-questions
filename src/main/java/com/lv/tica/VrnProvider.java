package com.lv.tica;

public class VrnProvider {
	
	public String getDescription(String vrn) {
		return ("".equals(vrn) ? "" : "Batmobile" + vrn);
	}

}
