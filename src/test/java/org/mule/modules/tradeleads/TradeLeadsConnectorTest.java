package org.mule.modules.tradeleads;

import static org.junit.Assert.*;

import org.junit.Test;

public class TradeLeadsConnectorTest {
	
	TradeLeadsConnector  tradeLeadsConnector = new TradeLeadsConnector();

	@Test
	public void testQuery() {
		System.out.println(tradeLeadsConnector.query("horses"));
	}

	@Test
	public void testSources() {
		System.out.println(tradeLeadsConnector.sources("GT,AU"));
	}
	
	@Test
	public void testIndustries() {
		System.out.println(tradeLeadsConnector.industries("horses"));
	}

	@Test
	public void testCountries() {
		System.out.println(tradeLeadsConnector.sources("GT,AU"));
	}
	
	@Test
	public void testtrade_regions() {
		System.out.println(tradeLeadsConnector.trade_regions("GT,AU"));
	}
	
	@Test
	public void testWorld_regions() {
		System.out.println(tradeLeadsConnector.world_regions("Asia,North America"));
	}
	
	
	

}
