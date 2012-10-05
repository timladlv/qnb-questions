package com.lv.tica.service;

import com.lv.tica.service.exception.InvalidAnswerException;

public class InvalidAnswerHandler {

	public void throwInvalidAnswerException () throws InvalidAnswerException {
		throw new InvalidAnswerException("bad answer detected!");
	}
}
