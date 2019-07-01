package com.m3.training.tradesprogram;

import java.math.BigDecimal;

public class Trade {
	
	private String symbol;
	private BigDecimal price;
	private BigDecimal amountPurchased;
	private BigDecimal totalPrice;

	public Trade(String symbol, String price, 
			String amountPurchased) {
		
		this.symbol = symbol;
		this.price = new BigDecimal(price);
		this.amountPurchased = new BigDecimal(amountPurchased);
		
		totalPrice = this.price.multiply(this.amountPurchased);		
		
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public BigDecimal getAmountPurchased() {
		return amountPurchased;
	}
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
}
