package com.infotech.enquiryservice.dto;

import java.io.Serializable;
import java.math.BigDecimal;
		
public class ProductEnquiry implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;
    private BigDecimal price;
    private String availability;
    private double discountOffer;
    private int unit;
    private double totalPrice;
    private int port;

    public ProductEnquiry(Long id, String name, BigDecimal price, String availability, double discountOffer, int unit,
			double totalPrice, int port) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
		this.discountOffer = discountOffer;
		this.unit = unit;
		this.totalPrice = totalPrice;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductEnquiry [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", availability=");
		builder.append(availability);
		builder.append(", discountOffer=");
		builder.append(discountOffer);
		builder.append(", unit=");
		builder.append(unit);
		builder.append(", totalPrice=");
		builder.append(totalPrice);
		builder.append(", port=");
		builder.append(port);
		builder.append("]");
		return builder.toString();
	}

    
    
 }
