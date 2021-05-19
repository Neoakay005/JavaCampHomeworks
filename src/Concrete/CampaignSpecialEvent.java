package Concrete;

import Abstract.DiscountService;
import Utility.CampaignUtility;

public class CampaignSpecialEvent implements DiscountService{


	@Override
	public double discount(String gameName, double gamePrice) {
		double discountVar = 0.70;
		System.out.println("--Özel Etkinlik Ýndirimi-- :" + gameName + " Oyunu indirimli fiyatý: " +
		CampaignUtility.calculateDiscount(gamePrice, discountVar));
		return CampaignUtility.calculateDiscount(gamePrice, discountVar);
	}

}
