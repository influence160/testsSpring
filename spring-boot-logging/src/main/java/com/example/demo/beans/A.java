package com.example.demo.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class A {
	Log LOGGER = LogFactory.getLog(A.class);

	public void test() {
		LOGGER.debug("test");
	}
}
