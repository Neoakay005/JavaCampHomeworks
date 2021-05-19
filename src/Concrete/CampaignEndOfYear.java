package Concrete;

import Abstract.DiscountService;
import Utility.CampaignUtility;

public class CampaignEndOfYear implements DiscountService{

	@Override
	public double discount(String gameName, double gamePrice) {
		double discountVar = 0.50;
		System.out.println("--Yýl Sonu Ýndirimi-- :" + gameName + " Oyunu indirimli fiyatý: " +
		CampaignUtility.calculateDiscount(gamePrice, discountVar));
		return CampaignUtility.calculateDiscount(gamePrice, discountVar);
	}

}
