package Concrete;

import Abstract.DiscountService;
import Utility.CampaignUtility;

public class CampaignSpring implements DiscountService{
	
	@Override
	public double discount(String gameName, double gamePrice) {
		double discountVar = 0.80;
		System.out.println("--Bahar Ýndirimi-- :" + gameName + " Oyunu indirimli fiyatý: " +
		CampaignUtility.calculateDiscount(gamePrice, discountVar));
		return CampaignUtility.calculateDiscount(gamePrice, discountVar);
	}
}
