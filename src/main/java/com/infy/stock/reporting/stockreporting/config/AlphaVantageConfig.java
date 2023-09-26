package com.infy.stock.reporting.stockreporting.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.stockreporting.alphavantage")
public class AlphaVantageConfig {
	
	private String baseurl;
	private String listingStatusQuery;
	private String dailyBasisQuery;
	public String getBaseurl() {
		return baseurl;
	}
	public void setBaseurl(String baseurl) {
		this.baseurl = baseurl;
	}
	public String getListingStatusQuery() {
		return listingStatusQuery;
	}
	public void setListingStatusQuery(String listingStatusQuery) {
		this.listingStatusQuery = listingStatusQuery;
	}
	public String getDailyBasisQuery() {
		return dailyBasisQuery;
	}
	public void setDailyBasisQuery(String dailyBasisQuery) {
		this.dailyBasisQuery = dailyBasisQuery;
	}

}
