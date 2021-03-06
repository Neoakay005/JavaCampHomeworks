package Utility;

import Abstract.DiscountService;
import Entity.GameStore;

public class CampaignUtility {
	public static void addCampaign(DiscountService discountServices, GameStore game) {
		System.out.println("Kampanya Eklendi");
		
	}
	
	public static void updateCampaign(DiscountService discountServices, GameStore game) {
		System.out.println("Kampanya Güncellendi");
	}
	
	public static void deleteCampaign(GameStore game) {
		System.out.println("Kampanya Kaldırılmıştır. Oyunun fiyatı: " + game.getGamePrice());
	}
	
	public static double calculateDiscount(double gamePrice, double discountRate) {
		return gamePrice * discountRate;
	}
}
