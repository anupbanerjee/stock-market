package org.anup.stock.market;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MessageSender {

	private static final Logger logger = LoggerFactory.getLogger(MessageSender.class);

	public String sendMessage(){
		logger.info("Sending Message Now!!!");
		return "Hello Camel!!!";
	}

}
