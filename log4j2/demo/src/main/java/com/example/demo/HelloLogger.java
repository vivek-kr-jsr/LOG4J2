package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloLogger {
	private static final Logger  = LogManager.getLogger(HelloLogger.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.debug("FROM DEBUG");
		LOGGER.info("FROM INFO");
		LOGGER.warn("FROM INFO");
		LOGGER.error("FROM INFO");
	}

}
