package com.infotech.enquiryservice.controller;

import com.infotech.enquiryservice.client.StockService;
import com.infotech.enquiryservice.dto.ProductEnquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product-enquiry/")
public class ProductEnquiryController {

	@Autowired
	StockService client;

	@GetMapping("name/{name}/availability/{availability}/unit/{unit}")
	public ProductEnquiry get(@PathVariable String name, @PathVariable String availability, @PathVariable int unit) {

		ProductEnquiry productEnquiry = client.checkProductStock(name, availability);

		double totalPrice = productEnquiry.getPrice().doubleValue() * unit;
		double discounts = productEnquiry.getDiscountOffer();
		double discountPrice = totalPrice - totalPrice * discounts / 100;

		return new ProductEnquiry(productEnquiry.getId(), name, productEnquiry.getPrice(), availability,
				productEnquiry.getDiscountOffer(), unit, discountPrice, productEnquiry.getPort()

		);

	}

}
