package com.bat.batscript;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Simulator {
	private static final Logger LOGGER = LoggerFactory.getLogger(Simulator.class);
	
	public Simulator(@Value ("${property.name}") String pname) {
		LOGGER.info("properties file name: {} ", pname);
	}

	public void runSimulator() throws InterruptedException {
	
	}
}