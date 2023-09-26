package com.infy.stock.reporting.stockreporting.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.infy.stock.reporting.stockreporting.config.AlphaVantageConfig;

@Component
public class RestUtil {
	
	@Autowired RestTemplate restTemplate;
	
	@Autowired AlphaVantageConfig alphaVantageConfig;

	public String getListingStatus() {
		String listingStatusUrl=String.format("%s%s", alphaVantageConfig.getBaseurl(),alphaVantageConfig.getListingStatusQuery());
		return listingStatusUrl;
	}
}