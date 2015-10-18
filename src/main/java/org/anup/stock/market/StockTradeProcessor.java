package org.anup.stock.market;

import org.anup.stock.broker.Stock;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockTradeProcessor {
	
	private static final Logger logger = LoggerFactory.getLogger(StockTradeProcessor.class);

	private KieSession session;
	
	public void processTrade(Exchange exchange){
		
		final Message message = exchange.getIn();
		final Stock stockTrade = (Stock) message.getBody();
		logger.info("Process Stock Trade For : {}" , stockTrade);
		getSession().insert(stockTrade);
		
	}

	/**
	 * @return the session
	 */
	public final KieSession getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public final void setSession(KieSession session) {
		this.session = session;
	}

	
}
