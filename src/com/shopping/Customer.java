package com.shopping;

import java.util.List;

public class Customer {

	String name;

	CustomerType customerType;

	public Customer(String name, CustomerType customerType) {
		super();
		this.name = name;

		this.customerType = customerType;
	}

	public int getBill(int purchasePrice) {

		List<DiscountRange> discountRangeList = customerType.getDiscountRate();

		int tempPurchasePrice = 0;
		int totalPrice = 0;
		int previousRange = 0;
		for (DiscountRange discountRange : discountRangeList) {

			if (discountRange.getDiscount() == 0) {

				totalPrice = discountRange.getPrice() - previousRange;
				previousRange = discountRange.getPrice();
				tempPurchasePrice = discountRange.getPrice();
			} else {

				if (discountRange.getPrice() == Integer.MAX_VALUE) {

					int leftMoney = purchasePrice - previousRange;
					int discountPrice = (discountRange.getDiscount() * leftMoney) / 100;
					totalPrice = totalPrice + (leftMoney - discountPrice);

				} else {

					int leftMoney = discountRange.getPrice() - previousRange;
					int discountPrice = (discountRange.getDiscount() * leftMoney) / 100;
					totalPrice = totalPrice + (leftMoney - discountPrice);
					previousRange = discountRange.getPrice();
					tempPurchasePrice = discountRange.getPrice();
				}
			}

			if (tempPurchasePrice == purchasePrice) {
				break;
			}
		}
		return totalPrice;
	}

}
