package com.m3.training.tradesprogram;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TradeTracker {

	public static void main(String[] args) {
		
		Trade tradeA = new Trade("A", "139.39", "200");
		Trade tradeB = new Trade("B", "1290.84", "39");
		Trade tradeC = new Trade("AA", "2348.97", "184");
		Trade tradeD = new Trade("AB", "230.45", "71");
		Trade tradeE = new Trade("AAA", "194.14", "132");
			
		Trade[] tradeList = {tradeA, tradeB, tradeC,
				tradeD, tradeE};
		
		BigDecimal totalAmount = calculateTotalAmount(tradeList);
		System.out.println("Total amount of money exchanged: " + totalAmount);
		}

	private static BigDecimal calculateTotalAmount(Trade[] tradeList) {
		
		int scale = 2;
		BigDecimal total = BigDecimal.ZERO;
		
		for(Trade trade : tradeList)
		{
			total = total.add(trade.getTotalPrice());
		}
		
		return total.setScale(scale, RoundingMode.HALF_EVEN);
	}
}
