package Concrete;

import Abstract.DiscountService;
import Utility.CampaignUtility;

public class CampaignSpecialEvent implements DiscountService{


	@Override
	public double discount(String gameName, double gamePrice) {
		double discountVar = 0.70;
		System.out.println("--�zel Etkinlik �ndirimi-- :" + gameName + " Oyunu indirimli fiyat�: " +
		CampaignUtility.calculateDiscount(gamePrice, discountVar));
		return CampaignUtility.calculateDiscount(gamePrice, discountVar);
	}

}
