package com.infy.stock.reporting.stockreporting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.stock.reporting.stockreporting.service.StockReportingService;

@RestController
public class StockReportingRestController {
	
	@Autowired private StockReportingService stockReportingService;
	
	@GetMapping("/listingStatus")
	public String listingStatus(@RequestParam String companyName) {
		return stockReportingService.listingStatus(companyName);
	}

}
