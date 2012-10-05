package com.lv.tica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeanCountingController {
	
	@Autowired
	BeanCounting beanCounting;
	
	@RequestMapping("/count/{input}")
	public HttpEntity<String> jmxExercise(@PathVariable String input) {
		return new HttpEntity<String>(beanCounting.echoUpper(input));
	}

}
