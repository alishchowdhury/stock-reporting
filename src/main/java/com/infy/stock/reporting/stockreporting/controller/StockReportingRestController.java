package com.infy.stock.reporting.stockreporting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockReportingRestController {
	
	@GetMapping("/listingStatus")
	public String listingStatus(@RequestParam String companyName) {
		return "Comapany name is "+companyName;
	}

}
