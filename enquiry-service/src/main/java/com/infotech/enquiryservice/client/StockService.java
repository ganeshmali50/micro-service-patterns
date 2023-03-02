package com.infotech.enquiryservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.infotech.enquiryservice.dto.ProductEnquiry;

@FeignClient(name = "api/v1/stock-service/")
public interface StockService {

	@GetMapping("/name/{name}/availability/{availability}")
	public ProductEnquiry checkProductStock(@PathVariable String name, @PathVariable String availability);

}
