package com.infy.stock.reporting.stockreporting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.stock.reporting.stockreporting.config.AlphaVantageConfig;
import com.infy.stock.reporting.stockreporting.utility.RestUtil;

@Service
public class StockReportingService {
	
	@Autowired private AlphaVantageConfig alphaVantageConfig;
	@Autowired private RestUtil restUtil;

	public String listingStatus(String companyName) {
		return restUtil.getListingStatus();
	}

}
