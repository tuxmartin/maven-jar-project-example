package com.example.net;

import org.apache.log4j.Logger;

public class Hello { 
	final static Logger logger = Logger.getLogger(Hello.class);
	
	public static void main(String[] args) { 
		System.out.println("Hello, World!");
		logger.debug("This is debug.");
	}
}
