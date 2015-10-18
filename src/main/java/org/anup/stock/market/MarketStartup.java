package org.anup.stock.market;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MarketStartup {
	
	private static final Logger logger = LoggerFactory.getLogger(":: DROOLS ::");

	private KieSession session;
	
	
	public void init() {
		logger.info(":: BrokerStartup :: initialized!!!");
		getSession().setGlobal("logger", logger);
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
